package SortingStudents;

import java.util.*;

public class SortingStudent {
    final static int heads = 500; // 생성할 인원 수
    final static int minHeight = 145; // 최소 키
    final static int maxHeightRange = 50; // 최소 키에 더해지는 최대 키의 범위
    static int boyCounter = 0;
    static int girlCounter = 0;

    public static void main(String[] args) {
        SortingStudent sample = new SortingStudent();
        TreeMap<Integer, String> boys = new TreeMap<>();
        TreeMap<Integer, String> girls = new TreeMap<>();

        sample.addStudents(boys, girls, heads);
        sample.showResults(boys, girls);
    }

    public static String randomHangulName() {
        List<String> 성 = Arrays.asList("김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신", "권", "황", "안",
                "송", "류", "전", "홍", "고", "문", "양", "손", "배", "조", "백", "허", "유", "남", "심", "노", "정", "하", "곽", "성", "차", "주",
                "우", "구", "신", "임", "나", "전", "민", "유", "진", "지", "엄", "채", "원", "천", "방", "공", "강", "현", "함", "변", "염", "양",
                "변", "여", "추", "노", "도", "소", "신", "석", "선", "설", "마", "길", "주", "연", "방", "위", "표", "명", "기", "반", "왕", "금",
                "옥", "육", "인", "맹", "제", "모", "장", "남", "탁", "국", "여", "진", "어", "은", "편", "구", "용");
        List<String> 이름 = Arrays.asList("가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노", "누", "다",
                "단", "달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", "명", "무", "문", "미", "민", "바", "박",
                "백", "범", "별", "병", "보", "빛", "사", "산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소", "솔", "수", "숙", "순",
                "숭", "슬", "승", "시", "신", "아", "안", "애", "엄", "여", "연", "영", "예", "오", "옥", "완", "요", "용", "우", "원", "월", "위",
                "유", "윤", "율", "으", "은", "의", "이", "익", "인", "일", "잎", "자", "잔", "장", "재", "전", "정", "제", "조", "종", "주", "준",
                "중", "지", "진", "찬", "창", "채", "천", "철", "초", "춘", "충", "치", "탐", "태", "택", "판", "하", "한", "해", "혁", "현", "형",
                "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운", "모", "배", "부", "림", "봉", "혼", "황", "량", "린", "을", "비",
                "솜", "공", "면", "탁", "온", "디", "항", "후", "려", "균", "묵", "송", "욱", "휴", "언", "령", "섬", "들", "견", "추", "걸", "삼",
                "열", "웅", "분", "변", "양", "출", "타", "흥", "겸", "곤", "번", "식", "란", "더", "손", "술", "훔", "반", "빈", "실", "직", "흠",
                "흔", "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개", "롱", "평", "늘", "늬", "랑", "얀", "향", "울", "련");
        Collections.shuffle(성);
        Collections.shuffle(이름);

        return 성.get(0) + 이름.get(0) + 이름.get(1);
    }

    public static String randomSex() {
        List<String> 성별 = Arrays.asList("남", "여");
        Collections.shuffle(성별);

        return 성별.get(0) ;
    }

    public static int randomHeight() {
        return (int)(Math.random() * maxHeightRange) + minHeight;
    }

    public void addStudents (TreeMap<Integer, String> boys, TreeMap<Integer, String> girls, Integer heads) {
        for (int i = 0; i < heads; i++) {
            int studentId = i + 1;
            String sex = randomSex();
            String name = randomHangulName();
            int height = randomHeight();

            if (sex.equals("남")) {
                if (boys.containsKey(height)) {
                    String sameHeights = boys.get(height) + ", " + name;
                    boys.replace(height, sameHeights);
                } else {
                    boys.put(height, name);
                }
                boyCounter++;
            } else {
                girls.put(studentId, name);
                girlCounter++;
            }
        }
    }

    private void showResults(TreeMap<Integer, String> boys, TreeMap<Integer, String> girls) {
        System.out.println("남자: "+boyCounter+"명 / 여자: "+girlCounter+"명");
        System.out.println("==============남자==============");
        for (Map.Entry<Integer, String> entry : boys.entrySet()) {
            System.out.println("[키]:" + entry.getKey() + "  [이름]:" + entry.getValue());
        }
        System.out.println("");
        System.out.println("==============여자==============");
        for (Map.Entry<Integer, String> entry : girls.entrySet()) {
            System.out.println("[학번]:" + entry.getKey() + "  [이름]:" + entry.getValue());
        }
    }
}
