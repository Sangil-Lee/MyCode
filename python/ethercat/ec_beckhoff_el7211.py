import pysoem
import time


#EL7211 Servo Terminal
def move_to_position(ifname='eth0', slave_pos=0, target_pos=10000):
    """지정된 위치로 서보 모터 이동."""
    master = pysoem.Master()
    master.open(ifname)
    master.config_init()
    slave = master.slaves[slave_pos]

    slave.sdo_write(0x6060, 0x00, 8, 8)  # CSP 모드 설정
    slave.sdo_write(0x6040, 0x00, 16, 0x0F)  # 제어 워드 설정 (활성화)
    slave.pdo_write(0x607A, 0x00, 32, target_pos)  # 목표 위치 설정

    time.sleep(5)  # 이동 시간 대기
    master.close()

def check_slave_state(ifname='eth0'):
    """EtherCAT 마스터 설정 및 슬레이브 상태 확인."""
    master = pysoem.Master()
    master.open(ifname)
    master.config_init()

    print(f"{master.slaves_count} slaves found.")
    for i in range(master.slaves_count):
        slave = master.slaves[i]
        print(f"Slave {i}: {slave.name}, State: {slave.state}")

    master.close()

def move_with_velocity(ifname='eth0', slave_pos=0, target_vel=1000):
    """지정된 속도로 서보 모터 이동."""
    master = pysoem.Master()
    master.open(ifname)
    master.config_init()
    slave = master.slaves[slave_pos]

    slave.sdo_write(0x6060, 0x00, 8, 9)  # CSV 모드 설정
    slave.sdo_write(0x6040, 0x00, 16, 0x0F)  # 제어 워드 설정 (활성화)
    slave.pdo_write(0x60FF, 0x00, 32, target_vel)  # 목표 속도 설정

    time.sleep(5)  # 이동 시간 대기
    master.close()

def perform_homing(ifname='eth0', slave_pos=0, homing_method=35):
    """서보 모터 홈 복귀 수행."""
    master = pysoem.Master()
    master.open(ifname)
    master.config_init()
    slave = master.slaves[slave_pos]

    slave.sdo_write(0x6060, 0x00, 8, 6)  # Homing Mode 설정
    slave.sdo_write(0x6098, 0x00, 8, homing_method)  # 홈 복귀 방법 설정
    slave.pdo_write(0x6040, 0x00, 16, 0x1F)  # 홈 복귀 시작

    time.sleep(10)  # 홈 복귀 완료 대기 (시간 조정 필요)
    master.close()

def sync_move_positions(ifname='eth0', target_positions=[10000, 20000]):
    """여러 서보 모터를 동기화하여 지정된 위치로 이동."""
    master = pysoem.Master()
    master.open(ifname)
    master.config_init()

    for i, slave in enumerate(master.slaves):
        slave.sdo_write(0x6060, 0x00, 8, 8)  # CSP 모드 설정
        slave.sdo_write(0x6040, 0x00, 16, 0x0F)  # 제어 워드 설정 (활성화)
        slave.pdo_write(0x607A, 0x00, 32, target_positions[i])  # 목표 위치 설정

    time.sleep(5)  # 이동 시간 대기
    master.close()


if __name__ == "__main__":
    check_slave_state()
    move_to_position()
    move_with_velocity()
    perform_homing()
    sync_move_postions()


# EL7401 Stepper motor

import pysoem

def check_slave_state(ifname='eth0'):
    """EtherCAT 마스터 설정 및 슬레이브 상태 확인."""
    master = pysoem.Master()
    master.open(ifname)
    master.config_init()

    print(f"{master.slaves_count} slaves found.")
    for i in range(master.slaves_count):
        slave = master.slaves[i]
        print(f"Slave {i}: {slave.name}, State: {slave.state}")

    master.close()

def move_stepper(ifname='eth0', slave_pos=0, target_pos=10000):
    """지정된 위치로 스텝 모터 이동."""
    master = pysoem.Master()
    master.open(ifname)
    master.config_init()
    slave = master.slaves[slave_pos]

    slave.sdo_write(0x6060, 0x00, 8, 1)  # 위치 제어 모드 설정
    slave.sdo_write(0x6040, 0x00, 16, 0x0F)  # 제어 워드 설정 (활성화)
    slave.pdo_write(0x607A, 0x00, 32, target_pos)  # 목표 위치 설정

    time.sleep(5)  # 이동 시간 대기
    master.close()


def control_stepper_velocity(ifname='eth0', slave_pos=0, target_vel=1000):
    """지정된 속도로 스텝 모터 이동."""
    master = pysoem.Master()
    master.open(ifname)
    master.config_init()
    slave = master.slaves[slave_pos]

    slave.sdo_write(0x6060, 0x00, 8, 3)  # 속도 제어 모드 설정
    slave.sdo_write(0x6040, 0x00, 16, 0x0F)  # 제어 워드 설정 (활성화)
    slave.pdo_write(0x60FF, 0x00, 32, target_vel)  # 목표 속도 설정

    time.sleep(5)  # 이동 시간 대기
    master.close()

import pysoem
import time

def perform_stepper_homing(ifname='eth0', slave_pos=0, homing_method=35):
    """스텝 모터 홈 복귀 수행."""
    master = pysoem.Master()
    master.open(ifname)
    master.config_init()
    slave = master.slaves[slave_pos]

    slave.sdo_write(0x6060, 0x00, 8, 6)  # Homing Mode 설정
    slave.sdo_write(0x6098, 0x00, 8, homing_method)  # 홈 복귀 방법 설정
    slave.pdo_write(0x6040, 0x00, 16, 0x1F)  # 홈 복귀 시작

    time.sleep(10)  # 홈 복귀 완료 대기 (시간 조정 필요)
    master.close()

def sync_move_steppers(ifname='eth0', target_positions=[10000, 20000]):
    """여러 스텝 모터를 동기화하여 지정된 위치로 이동."""
    master = pysoem.Master()
    master.open(ifname)
    master.config_init()

    for i, slave in enumerate(master.slaves):
        slave.sdo_write(0x6060, 0x00, 8, 1)  # 위치 제어 모드 설정
        slave.sdo_write(0x6040, 0x00, 16, 0x0F)  # 제어 워드 설정 (활성화)
        slave.pdo_write(0x607A, 0x00, 32, target_positions[i])  # 목표 위치 설정

    time.sleep(5)  # 이동 시간 대기
    master.close()


if __name__ == "__main__":
    check_slave_state()
    move_stepper()
    control_stepper_velocity()
    perform_stepper_homing()
    sync_move_steppers()


