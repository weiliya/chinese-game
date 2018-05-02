package com.chinese.words.service;

import com.chinese.words.model.Hanzi;
import com.chinese.words.model.Word;
import com.chinese.words.repository.HanziRepository;
import com.chinese.words.repository.WordRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.github.pffy.chinese.HanyuPinyin;
import com.github.pffy.chinese.Tone;
import java.text.ParseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Component
public class CharacterInitializerBean {

    private static final Logger log = LoggerFactory.getLogger(CharacterInitializerBean.class);


    public CharacterInitializerBean(HanziRepository hanziRepository, WordRepository wordRepository) throws ParseException {

    HanyuPinyin hanyuPinyin = new HanyuPinyin(null, Tone.TONE_MARKS);


        wordRepository.save(new Word("你好", "hi"));
        wordRepository.save(new Word("朋友", "friend"));
        wordRepository.save(new Word("爱", "to love"));
        wordRepository.save(new Word("八", "eight"));
        wordRepository.save(new Word("爸爸", "father"));
        wordRepository.save(new Word("杯子", "cup"));
        wordRepository.save(new Word("北京", "Beijing"));
        wordRepository.save(new Word("本", "classifier for books"));
        wordRepository.save(new Word("不", "not"));
        wordRepository.save(new Word("不客气", "you are welcome"));
        wordRepository.save(new Word("菜", "dish"));
        wordRepository.save(new Word("茶", "tea"));
        wordRepository.save(new Word("吃", "to eat"));
        wordRepository.save(new Word("出租车", "taxi"));
        wordRepository.save(new Word("打电话", "to make a phone call"));
        wordRepository.save(new Word("大", "big"));
        wordRepository.save(new Word("的", "of"));
        wordRepository.save(new Word("点", "oclock"));
        wordRepository.save(new Word("电脑", "computer"));
        wordRepository.save(new Word("电视", "television"));
        wordRepository.save(new Word("电影", "movie"));
        wordRepository.save(new Word("东西", "thing"));
        wordRepository.save(new Word("都", "both"));
        wordRepository.save(new Word("读", "to read"));
        wordRepository.save(new Word("对不起", "excuse me"));
        wordRepository.save(new Word("多", "a lot of"));
        wordRepository.save(new Word("多少", "how much"));
        wordRepository.save(new Word("儿子", "son"));
        wordRepository.save(new Word("二", "two"));
        wordRepository.save(new Word("饭馆", "restaurant"));
        wordRepository.save(new Word("飞机", "airplane"));
        wordRepository.save(new Word("分钟", "minute"));
        wordRepository.save(new Word("高兴", "happy"));
        wordRepository.save(new Word("个", "classifier for people"));
        wordRepository.save(new Word("工作", "to work"));
        wordRepository.save(new Word("狗", "dog"));
        wordRepository.save(new Word("汉语", "Chinese language"));
        wordRepository.save(new Word("好", "good"));
        wordRepository.save(new Word("喝", "to drink"));
        wordRepository.save(new Word("和", "and"));
        wordRepository.save(new Word("很", "very"));
        wordRepository.save(new Word("后面", "behind"));
        wordRepository.save(new Word("回", "to return"));
        wordRepository.save(new Word("会", "to gather"));
        wordRepository.save(new Word("火车站", "train station"));
        wordRepository.save(new Word("家", "home"));
        wordRepository.save(new Word("叫", "to call"));
        wordRepository.save(new Word("今天", "today"));
        wordRepository.save(new Word("九", "nine"));
        wordRepository.save(new Word("开", "to open"));
        wordRepository.save(new Word("看", "to look after"));
        wordRepository.save(new Word("看见", "to see"));
        wordRepository.save(new Word("块", "classifier for money"));
        wordRepository.save(new Word("来", "to come"));
        wordRepository.save(new Word("老师", "teacher"));
        wordRepository.save(new Word("了", "completed action marker"));
        wordRepository.save(new Word("冷", "cold"));
        wordRepository.save(new Word("里", "in"));
        wordRepository.save(new Word("零", "zero"));
        wordRepository.save(new Word("六", "six"));
        wordRepository.save(new Word("妈妈", "mother"));
        wordRepository.save(new Word("吗", "question tag"));
        wordRepository.save(new Word("买", "to buy"));
        wordRepository.save(new Word("猫", "cat"));
        wordRepository.save(new Word("没", "have not"));
        wordRepository.save(new Word("没关系", "it does not matter"));
        wordRepository.save(new Word("米饭", "rice"));
        wordRepository.save(new Word("明天", "tomorrow"));
        wordRepository.save(new Word("名字", "name"));
        wordRepository.save(new Word("哪", "which?"));
        wordRepository.save(new Word("哪儿", "where?"));
        wordRepository.save(new Word("那", "that"));
        wordRepository.save(new Word("那儿", "there"));
        wordRepository.save(new Word("呢", "question particle for subjects already mentioned"));
        wordRepository.save(new Word("能", "can"));
        wordRepository.save(new Word("你", "you"));
        wordRepository.save(new Word("年", "year"));
        wordRepository.save(new Word("女儿", "daughter"));
        wordRepository.save(new Word("漂亮", "pretty"));
        wordRepository.save(new Word("苹果", "apple"));
        wordRepository.save(new Word("七", "seven"));
        wordRepository.save(new Word("钱", "money"));
        wordRepository.save(new Word("前面", "in front of"));
        wordRepository.save(new Word("请", "please"));
        wordRepository.save(new Word("去", "to go"));
        wordRepository.save(new Word("热", "hot"));
        wordRepository.save(new Word("人", "person"));
        wordRepository.save(new Word("认识", "to know"));
        wordRepository.save(new Word("日", "Japan"));
        wordRepository.save(new Word("三", "three"));
        wordRepository.save(new Word("商店", "shop"));
        wordRepository.save(new Word("上", "on"));
        wordRepository.save(new Word("上午", "morning"));
        wordRepository.save(new Word("少", "few"));
        wordRepository.save(new Word("谁", "who?"));
        wordRepository.save(new Word("什么", "what?"));
        wordRepository.save(new Word("十", "ten"));
        wordRepository.save(new Word("时候", "time"));
        wordRepository.save(new Word("是", "to be"));
        wordRepository.save(new Word("书", "book"));
        wordRepository.save(new Word("水", "water"));
        wordRepository.save(new Word("水果", "fruit"));
        wordRepository.save(new Word("睡觉", "to go to bed"));
        wordRepository.save(new Word("说话", "to talk"));
        wordRepository.save(new Word("四", "four"));
        wordRepository.save(new Word("岁", "classifier for age"));
        wordRepository.save(new Word("他", "he"));
        wordRepository.save(new Word("她", "she"));
        wordRepository.save(new Word("太", "too"));
        wordRepository.save(new Word("天气", "weather"));
        wordRepository.save(new Word("听", "to hear"));
        wordRepository.save(new Word("同学", "classmate"));
        wordRepository.save(new Word("喂", "hallo"));
        wordRepository.save(new Word("我", "I"));
        wordRepository.save(new Word("我们", "we"));
        wordRepository.save(new Word("五", "five"));
        wordRepository.save(new Word("喜欢", "to like"));
        wordRepository.save(new Word("下", "down"));
        wordRepository.save(new Word("下午", "afternoon"));
        wordRepository.save(new Word("下雨", "to rain"));
        wordRepository.save(new Word("先生", "mister"));
        wordRepository.save(new Word("现在", "now"));
        wordRepository.save(new Word("想", "to miss"));
        wordRepository.save(new Word("小", "small"));
        wordRepository.save(new Word("小姐", "miss"));
        wordRepository.save(new Word("些", "some"));
        wordRepository.save(new Word("写", "to write"));
        wordRepository.save(new Word("谢谢", "thanks"));
        wordRepository.save(new Word("星期", "week"));
        wordRepository.save(new Word("学生", "student"));
        wordRepository.save(new Word("学习", "to learn"));
        wordRepository.save(new Word("学校", "school"));
        wordRepository.save(new Word("一", "one"));
        wordRepository.save(new Word("衣服", "clothes"));
        wordRepository.save(new Word("医生", "doctor"));
        wordRepository.save(new Word("医院", "hospital"));
        wordRepository.save(new Word("椅子", "chair"));
        wordRepository.save(new Word("有", "to have"));
        wordRepository.save(new Word("月", "month"));
        wordRepository.save(new Word("在", "to be at"));
        wordRepository.save(new Word("再见", "see you"));
        wordRepository.save(new Word("怎么", "how?"));
        wordRepository.save(new Word("怎么样", "how are things?"));
        wordRepository.save(new Word("这", "this"));
        wordRepository.save(new Word("这儿", "here"));
        wordRepository.save(new Word("中国", "China"));
        wordRepository.save(new Word("中午", "noon"));
        wordRepository.save(new Word("住", "to live"));
        wordRepository.save(new Word("桌子", "table"));
        wordRepository.save(new Word("字", "character"));
        wordRepository.save(new Word("昨天", "yesterday"));
        wordRepository.save(new Word("做", "to do"));
        wordRepository.save(new Word("坐", "to sit"));
        wordRepository.save(new Word("几", "how much"));

        for (Word word : wordRepository.findAll()) {
            String[] chars = word.getChineseMeaning().split("");
            for (String hanzi : chars) {
                Hanzi oldHanzi = hanziRepository.findByName(hanzi);

                if(oldHanzi != null){
                    log.info("already exists: " + hanzi);
                    word.addHanzi(oldHanzi);
                }
                else {
                    hanyuPinyin.setInput(hanzi);
                    Hanzi currentHanzi = new Hanzi(hanzi, hanyuPinyin.toString());
                    log.info("creating new hanzi: " + hanzi);
                    word.addHanzi(currentHanzi);
                }

            }
            wordRepository.save(word);
        }

     /*   chineseAppService.saveHanzi("好","hao3"));
        chineseAppService.saveHanzi("八", "ba1"));
        chineseAppService.saveHanzi("爱", "ai4"));
        chineseAppService.saveHanzi("爸", "ba4"));
        chineseAppService.saveHanzi("杯", "bei1"));
        chineseAppService.saveHanzi("子", "zi"));
        chineseAppService.saveHanzi("北", "bei3"));
        chineseAppService.saveHanzi("京", "jing1"));



        chineseAppService.saveWord("你好", "hi"));


        chineseAppService.saveHanzi("本", "ben3"));
        chineseAppService.saveHanzi("不", "bu4"));
        chineseAppService.saveHanzi("客", "ke4"));
        chineseAppService.saveHanzi("气", "qi"));
        chineseAppService.saveHanzi("菜", "cai4"));
        chineseAppService.saveHanzi("茶", "cha2"));
        chineseAppService.saveHanzi("吃", "chi1"));
        chineseAppService.saveHanzi("出", "chu1"));
        chineseAppService.saveHanzi("租", "zu1"));
        chineseAppService.saveHanzi("车", "che1"));
        chineseAppService.saveHanzi("打", "da3"));
        chineseAppService.saveHanzi("电", "dian4"));
        chineseAppService.saveHanzi("话", "hua4"));
        chineseAppService.saveHanzi("大", "da4"));
        chineseAppService.saveHanzi("的", "de"));
        chineseAppService.saveHanzi("点", "dian3"));
        chineseAppService.saveHanzi("脑", "nao3"));
        chineseAppService.saveHanzi("视", "shi4"));
        chineseAppService.saveHanzi("影", "ying3"));
        chineseAppService.saveHanzi("东", "dong1"));
        chineseAppService.saveHanzi("西", "xi"));
        chineseAppService.saveHanzi("都", "dou1"));
        chineseAppService.saveHanzi("读", "du"));
        chineseAppService.saveHanzi("对", "dui4"));
        chineseAppService.saveHanzi("起", "qi3"));
        chineseAppService.saveHanzi("多", "duo1"));
        chineseAppService.saveHanzi("少", "shao3"));
        chineseAppService.saveHanzi("儿", "er2"));
        chineseAppService.saveHanzi("二", "er4"));
        chineseAppService.saveHanzi("饭", "fan4"));
        chineseAppService.saveHanzi("馆", "guan3"));
        chineseAppService.saveHanzi("飞", "fei1"));
        chineseAppService.saveHanzi("机", "ji1"));
        chineseAppService.saveHanzi("分", "fen1"));
        chineseAppService.saveHanzi("钟", "zhong1"));
        chineseAppService.saveHanzi("高", "gao1"));
        chineseAppService.saveHanzi("兴", "xing4"));
        chineseAppService.saveHanzi("个", "ge4"));
        chineseAppService.saveHanzi("工", "gong1"));
        chineseAppService.saveHanzi("作", "zuo4"));
        chineseAppService.saveHanzi("狗", "gou3"));
        chineseAppService.saveHanzi("汉", "han4"));
        chineseAppService.saveHanzi("喝", "he1"));
        chineseAppService.saveHanzi("和", "he2"));
        chineseAppService.saveHanzi("很", "hen3"));
        chineseAppService.saveHanzi("后", "hou4"));
        chineseAppService.saveHanzi("面", "mian"));
        chineseAppService.saveHanzi("回", "hui2"));
        chineseAppService.saveHanzi("会", "hui4"));
        chineseAppService.saveHanzi("火", "huo3"));
        chineseAppService.saveHanzi("站", "zhan"));
        chineseAppService.saveHanzi("几", "ji3"));
        chineseAppService.saveHanzi("家", "jia1"));
        chineseAppService.saveHanzi("叫", "jiao4"));
        chineseAppService.saveHanzi("今", "jin1"));
        chineseAppService.saveHanzi("天", "tian1"));
        chineseAppService.saveHanzi("九", "jiu3"));
        chineseAppService.saveHanzi("开", "kai1"));
        chineseAppService.saveHanzi("看", "kan1"));
        chineseAppService.saveHanzi("见", "jian4"));
        chineseAppService.saveHanzi("块", "kuai4"));
        chineseAppService.saveHanzi("来", "lai2"));
        chineseAppService.saveHanzi("老", "lao3"));
        chineseAppService.saveHanzi("师", "shi1"));
        chineseAppService.saveHanzi("了", "le"));
        chineseAppService.saveHanzi("冷", "leng3"));
        chineseAppService.saveHanzi("里", "li3"));
        chineseAppService.saveHanzi("零", "ling2"));
        chineseAppService.saveHanzi("六", "liu4"));
        chineseAppService.saveHanzi("妈", "ma1"));
        chineseAppService.saveHanzi("吗", "ma"));
        chineseAppService.saveHanzi("买", "mai3"));
        chineseAppService.saveHanzi("猫", "mao1"));
        chineseAppService.saveHanzi("没", "mei2"));
        chineseAppService.saveHanzi("关", "guan1"));
        chineseAppService.saveHanzi("系", "xi"));
        chineseAppService.saveHanzi("米", "mi3"));
        chineseAppService.saveHanzi("饭", "fan4"));
        chineseAppService.saveHanzi("明", "ming2"));
        chineseAppService.saveHanzi("名", "ming2"));
        chineseAppService.saveHanzi("哪", "na2"));
        chineseAppService.saveHanzi("儿", "er2"));
        chineseAppService.saveHanzi("那", "na4"));
        chineseAppService.saveHanzi("呢", "ne"));
        chineseAppService.saveHanzi("能", "neng2"));
        chineseAppService.saveHanzi("你", "ni3"));
        chineseAppService.saveHanzi("年", "nian2"));
        chineseAppService.saveHanzi("女", "nv3"));
        chineseAppService.saveHanzi("朋", "peng2"));
        chineseAppService.saveHanzi("友", "you"));
        chineseAppService.saveHanzi("漂", "piao4"));
        chineseAppService.saveHanzi("亮", "liang"));
        chineseAppService.saveHanzi("苹", "ping2"));
        chineseAppService.saveHanzi("果", "guo3"));
        chineseAppService.saveHanzi("七", "qi1"));
        chineseAppService.saveHanzi("钱", "qian2"));
        chineseAppService.saveHanzi("前", "qian2"));
        chineseAppService.saveHanzi("请", "qing3"));
        chineseAppService.saveHanzi("去", "qu4"));
        chineseAppService.saveHanzi("热", "re4"));
        chineseAppService.saveHanzi("人", "ren2"));
        chineseAppService.saveHanzi("认", "ren4"));
        chineseAppService.saveHanzi("识", "shi5"));
        chineseAppService.saveHanzi("日", "ri4"));
        chineseAppService.saveHanzi("三", "san1"));
        chineseAppService.saveHanzi("商", "shang1"));
        chineseAppService.saveHanzi("店", "dian4"));
        chineseAppService.saveHanzi("上", "shang4"));
        chineseAppService.saveHanzi("午", "wu3"));
        chineseAppService.saveHanzi("谁", "shei2"));
        chineseAppService.saveHanzi("什", "shen2"));
        chineseAppService.saveHanzi("么", "me"));
        chineseAppService.saveHanzi("十", "shi2"));
        chineseAppService.saveHanzi("时", "shi2"));
        chineseAppService.saveHanzi("候", "hou"));
        chineseAppService.saveHanzi("是", "shi4"));
        chineseAppService.saveHanzi("书", "shu1"));
        chineseAppService.saveHanzi("水", "shui3"));
        chineseAppService.saveHanzi("睡", "shui4"));
        chineseAppService.saveHanzi("觉", "jiao4"));
        chineseAppService.saveHanzi("说", "shuo1"));
        chineseAppService.saveHanzi("四", "si4"));
        chineseAppService.saveHanzi("岁", "sui4"));
        chineseAppService.saveHanzi("他", "ta1"));
        chineseAppService.saveHanzi("她", "ta1"));
        chineseAppService.saveHanzi("太", "tai4"));
        chineseAppService.saveHanzi("气", "qi4"));
        chineseAppService.saveHanzi("听", "ting1"));
        chineseAppService.saveHanzi("学", "xue2"));
        chineseAppService.saveHanzi("喂", "wei4"));
        chineseAppService.saveHanzi("我", "wo3"));
        chineseAppService.saveHanzi("们", "men"));
        chineseAppService.saveHanzi("五", "wu3"));
        chineseAppService.saveHanzi("喜", "xi3"));
        chineseAppService.saveHanzi("欢", "huan"));
        chineseAppService.saveHanzi("下", "xia4"));
        chineseAppService.saveHanzi("雨", "yu3"));
        chineseAppService.saveHanzi("先", "xian1"));
        chineseAppService.saveHanzi("生", "sheng"));
        chineseAppService.saveHanzi("现", "xian4"));
        chineseAppService.saveHanzi("在", "zai4"));
        chineseAppService.saveHanzi("想", "xiang3"));
        chineseAppService.saveHanzi("小", "xiao3"));
        chineseAppService.saveHanzi("姐", "jie"));
        chineseAppService.saveHanzi("些", "xie1"));
        chineseAppService.saveHanzi("写", "xie3"));
        chineseAppService.saveHanzi("谢", "xie4"));
        chineseAppService.saveHanzi("星", "xing1"));
        chineseAppService.saveHanzi("期", "qi1"));
        chineseAppService.saveHanzi("学", "xue2"));
        chineseAppService.saveHanzi("习", "xi2"));
        chineseAppService.saveHanzi("校", "xiao4"));
        chineseAppService.saveHanzi("一", "yi1"));
        chineseAppService.saveHanzi("衣", "yi1"));
        chineseAppService.saveHanzi("服", "fu"));
        chineseAppService.saveHanzi("医", "yi1"));
        chineseAppService.saveHanzi("院", "yuan4"));
        chineseAppService.saveHanzi("椅", "yi3"));
        chineseAppService.saveHanzi("有", "you3"));
        chineseAppService.saveHanzi("月", "yue4"));
        chineseAppService.saveHanzi("再", "zai4"));
        chineseAppService.saveHanzi("怎", "zen3"));
        chineseAppService.saveHanzi("样", "yang4"));
        chineseAppService.saveHanzi("这", "zhe4"));
        chineseAppService.saveHanzi("中", "zhong1"));
        chineseAppService.saveHanzi("国", "guo2"));
        chineseAppService.saveHanzi("住", "zhu4"));
        chineseAppService.saveHanzi("桌", "zhuo1"));
        chineseAppService.saveHanzi("昨", "zuo2"));
        chineseAppService.saveHanzi("做", "zuo4"));
        chineseAppService.saveHanzi("坐", "zuo4")); */

    }

}
