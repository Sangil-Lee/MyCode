import pysoem
import time


# Ex.1 기본 EtherCAT 통신 설정 및 슬레이브 정보 읽기.
# EtherCAT 마스터 설정
master = pysoem.Master()
master.open("eth0")  # 이더넷 인터페이스 이름

# 슬레이브 스캔
master.config_init()

# 슬레이브 정보 출력
for i in range(master.slaves_count):
    slave = master.slaves[i]
    print(f"Slave {i}: {slave.name}")

# EtherCAT 마스터 종료
master.close()


# Ex.2(slave PDO mapping and read/write data.
# ... (마스터 설정 및 슬레이브 스캔)

# 슬레이브 PDO 매핑 설정 (예: 위치 제어)
slave = master.slaves[0]
slave.sdo_write(0x6060, 0x00, 8, 8)  # 작동 모드 설정 (CSP)
slave.sdo_write(0x6040, 0x00, 16, 0x0F)  # 제어 워드 설정 (활성화)


# 데이터 읽기 (예: 현재 위치)
position = slave.pdo_read(0x6064, 0x00, 32)
print(f"Current Position: {position}")

# 데이터 쓰기 (예: 목표 위치)
slave.pdo_write(0x607A, 0x00, 32, 10000)

# ... (마스터 종료)

# Ex.3 ... (마스터 설정 및 슬레이브 설정)

# 목표 위치 설정
target_position = 10000

# 위치 제어 루프
for i in range(100):
    slave.pdo_write(0x607A, 0x00, 32, target_position)
    time.sleep(0.01)

# ... (마스터 종료)


 ... (마스터 설정 및 슬레이브 설정)

# 목표 속도 설정
target_velocity = 1000

# 속도 제어 루프
for i in range(100):
    slave.pdo_write(0x60FF, 0x00, 32, target_velocity)
    time.sleep(0.01)

# ... (마스터 종료)


# ... (마스터 설정 및 슬레이브 설정)

# 목표 토크 설정
target_torque = 100

# 토크 제어 루프
for i in range(100):
    slave.pdo_write(0x6071, 0x00, 16, target_torque)
    time.sleep(0.01)

# ... (마스터 종료)


# ... (마스터 설정 및 슬레이브 설정)

# 홈 복귀 설정
slave.sdo_write(0x6060, 0x00, 8, 6)  # 작동 모드 설정 (Homing Mode)
slave.sdo_write(0x6098, 0x00, 8, 35)  # 홈 복귀 방법 설정

# 홈 복귀 시작
slave.pdo_write(0x6040, 0x00, 16, 0x1F)

# ... (홈 복귀 완료 확인)

# ... (마스터 종료)


# ... (마스터 설정 및 여러 슬레이브 설정)

# 목표 위치 설정
target_positions = [10000, 20000, 30000]

# 다축 동기 제어 루프
for i in range(100):
    for j, slave in enumerate(master.slaves):
        slave.pdo_write(0x607A, 0x00, 32, target_positions[j])
    time.sleep(0.01)

# ... (마스터 종료)


# ... (마스터 설정 및 슬레이브 설정)

# 캠 테이블 데이터 생성
cam_table = [0, 1000, 2000, 3000, 4000, 5000]

# 캠 테이블 데이터 쓰기 (SDO)
for i, value in enumerate(cam_table):
    slave.sdo_write(0x60C2, i + 1, 32, value)

# 캠 제어 시작
slave.sdo_write(0x6060, 0x00, 8, 4)  # 작동 모드 설정 (Cam Table Mode)
slave.pdo_write(0x6040, 0x00, 16, 0x0F)

# ... (캠 제어 완료 확인)

# ... (마스터 종료)


# ... (마스터 설정 및 슬레이브 설정)

# 기어비 설정
slave.sdo_write(0x6091, 0x01, 32, 2)  # 분자
slave.sdo_write(0x6091, 0x02, 32, 1)  # 분모

# 기어 제어 시작
slave.sdo_write(0x6060, 0x00, 8, 5)  # 작동 모드 설정 (Gear Mode)
slave.pdo_write(0x6040, 0x00, 16, 0x0F)

# ... (기어 제어 완료 확인)

# ... (마스터 종료)


# ... (마스터 설정 및 슬레이브 설정)

# 오류 발생 시
try:
    # ... (오류 발생 가능성이 있는 코드)
    pass
except pysoem.SoemError as e:
    print(f"EtherCAT Error: {e}")

# 슬레이브 상태 확인
for i in range(master.slaves_count):
    slave = master.slaves[i]
    print(f"Slave {i} State: {slave.state}")

# ... (마스터 종료)
