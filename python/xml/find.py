from lxml import etree

tree = etree.parse("alarm_config.xml")
root = tree.getroot()


#for element in root.xpath("//component[@name='Group']"):
    #print(element.text,':', element.text.strip())

def print_element(element, indent=0):
    print(" " * indent + "<" + element.tag + ">")
    if element.text and element.text.strip():
        print(" " * (indent+1) + element.text.strip())

    for child in element:
        print_element(child, indent+1)
    print(" " * indent + "</" + element.tag + ">")

#print_element(element)

def print_element_with_attributes(element, indent=0):
    """요소와 하위 요소를 재귀적으로 출력하고, 속성 이름을 함께 출력하는 함수"""
    print("  " * indent + "<" + element.tag, end="") # 시작 태그 출력
    if element.attrib: # 속성이 있는 경우
        for attr_name, attr_value in element.attrib.items():
            print(f' {attr_name}="{attr_value}"', end="") # 속성 이름과 값 출력
    print(">")
    if element.text and element.text.strip(): # 텍스트 내용 출력
        print("  " * (indent + 1) + element.text.strip())
    for child in element: # 하위 요소 재귀적 출력
        print_element_with_attributes(child, indent + 1)
    print("  " * indent + "</" + element.tag + ">") # 종료 태그 출력

#for element in root.xpath("//component[@name='Group']"):
#for element in root.xpath("//component[@name='Group']") and root.xpath("//pv[@name='ctrlslab:A_Alarm_1']"):
    #print_element(element)
    #print_element_with_attributes(element)
    #element.attrib.clear()
#    element.clear()

for nodes in root.xpath("//component[@name='Group']") and root.xpath("//pv[@name='ctrlslab:A_Alarm_1']"):
    for node in nodes:
        parent = node.getparent()
        parent.remove(node)

    parent = nodes.getparent() 
    parent.remove(nodes)

#def remove_specific_child_node(tree, parent_xpath, child_tag):
#    """특정 노드의 특정 하위 노드를 삭제하는 함수"""
#    parent_nodes = tree.xpath(parent_xpath)
#    for parent_node in parent_nodes:
#        for child_node in parent_node.findall(child_tag):
#            parent_node.remove(child_node)
#    
#
#remove_specific_child_node(tree, "//component[@name='Group']", "//pv[@name='ctrlslab:A_Alarm_1']")

tree.write("modified_example.xml", pretty_print=True)

    #for book in root.xpath("//book[@id]"):  # book id 속성을 가진 모든 book 요소 선택
    #book.attrib.clear()  # 기존 속성 모두 삭제
    #book.attrib["id"] = book.get("id") # id 속성만 다시 추가 (선택사항)
    #book.attrib["new_attribute1"] = "value1" # 새로운 속성 추가
    #book.attrib["new_attribute2"] = "value2"
    ## ... 필요한 만큼 속성 추가

#tree.write("modified_example.xml", pretty_print=True)
