from PyPDF2 import PdfMerger

def merge_pdfs(pdf1_path, pdf2_path, output_path):
    """두 개의 PDF 파일을 합쳐 하나의 PDF 파일로 저장합니다."""

    merger = PdfMerger()

    try:
        merger.append(pdf1_path)
        merger.append(pdf2_path)

        with open(output_path, "wb") as output_file:
            merger.write(output_file)

        print(f"PDF 파일이 성공적으로 합쳐져 '{output_path}'에 저장되었습니다.")

    except FileNotFoundError:
        print("오류: 지정된 PDF 파일을 찾을 수 없습니다.")

    except Exception as e:
        print(f"오류 발생: {e}")

    finally:
        merger.close()

# 사용 예시
pdf1_path = "file1.pdf"  # 첫 번째 PDF 파일 경로
pdf2_path = "file2.pdf"  # 두 번째 PDF 파일 경로
output_path = "merged_file.pdf"  # 합쳐진 PDF 파일을 저장할 경로

merge_pdfs(pdf1_path, pdf2_path, output_path)
