package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class JavaBeanSerializer implements ObjectSerializer {
    protected int features;
    private final FieldSerializer[] getters;
    private final FieldSerializer[] sortedGetters;
    protected final String typeKey;
    protected final String typeName;
    private static final char[] true_chars = {'t', 'r', 'u', 'e'};
    private static final char[] false_chars = {'f', 'a', 'l', 's', 'e'};

    public JavaBeanSerializer(Class<?> cls) {
        this(cls, (PropertyNamingStrategy) null);
    }

    private static Map<String, String> map(String... strArr) {
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            hashMap.put(str, str);
        }
        return hashMap;
    }

    public Map<String, Object> getFieldValuesMap(Object obj) throws Exception {
        FieldSerializer[] fieldSerializerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.sortedGetters.length);
        for (FieldSerializer fieldSerializer : this.sortedGetters) {
            linkedHashMap.put(fieldSerializer.fieldInfo.name, fieldSerializer.getPropertyValue(obj));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(8:459|107|(3:(3:125|(3:128|(2:463|130)|126)|464)|131|(1:133)(7:134|(5:136|(1:138)(2:139|(2:141|142)(2:143|(1:145)(1:146)))|(4:(3:151|(1:153)(2:155|(1:157)(2:158|(1:160)))|154)(1:161)|162|(3:165|(2:465|167)(1:168)|163)|466)(1:170)|169|(5:172|114|305|474|406)(12:(4:(3:176|(1:178)(2:180|(1:182)(2:183|(1:185)))|179)|186|(2:189|187)|467)(1:190)|(5:(3:194|(1:196)(2:198|(1:200)(2:201|(1:203)))|197)|204|(3:207|208|205)|468|209)(1:210)|211|(1:277)(4:214|215|(2:217|(2:224|(4:228|(5:(1:316)(4:307|(2:309|(1:311)(1:312))|313|(1:315))|(2:(1:319)|320)(1:(2:(1:324)|325)(2:(1:(4:328|(2:330|(1:332)(5:333|(1:334)|469|336|338))|337|338)(1:339))|(3:(1:(2:376|(2:378|(2:382|384)(1:383))(2:385|(1:387)(1:388)))(2:389|(1:(2:392|(3:394|(1:396)(1:397)|(1:399)(1:400))(1:401))(1:402))(1:403)))(1:404)|405|473)(2:342|(2:344|(1:346)(10:(1:348)(1:349)|350|(2:365|351)|470|353|(1:355)|356|(2:358|(1:360)(2:361|(1:364)))|362|(0)))(2:366|(1:368)(2:369|(1:(1:372)(1:373)))))))|321|405|473)|305|474))(3:223|305|474))(2:229|(2:231|(2:238|(7:242|(0)|(0)(0)|(0)(0)|321|405|473))(3:237|305|474))(2:243|(2:245|(2:252|(7:256|(0)|(0)(0)|(0)(0)|321|405|473))(3:251|305|474))(4:257|(2:259|(2:266|(7:270|(0)|(0)(0)|(0)(0)|321|405|473))(1:265))(1:(1:276))|305|474)))|406)|278|(0)|(0)(0)|(0)(0)|321|405|473|406))(1:148)|147|142|(0)(0)|169|(0)(0)))|113|114|305|474|406)|455|105) */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x05eb, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x05ec, code lost:
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x05f0, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x05f1, code lost:
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0602, code lost:
        r5 = r5 + ", fieldName : " + r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0617, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d8, code lost:
        if (r10.parent != null) goto L_0x00da;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03f6 A[Catch: all -> 0x0185, Exception -> 0x018b, TryCatch #7 {Exception -> 0x018b, all -> 0x0185, blocks: (B:107:0x0158, B:109:0x0173, B:111:0x0177, B:119:0x0191, B:121:0x0195, B:125:0x019e, B:126:0x01a2, B:128:0x01a8, B:134:0x01ba, B:136:0x01c0, B:138:0x01c5, B:139:0x01d5, B:141:0x01d9, B:143:0x01e9, B:145:0x01ed, B:146:0x01fd, B:148:0x0209, B:151:0x0212, B:153:0x0218, B:155:0x021f, B:157:0x0223, B:158:0x0228, B:160:0x022c, B:162:0x0233, B:163:0x0237, B:165:0x023d, B:176:0x0261, B:178:0x0265, B:180:0x026c, B:182:0x0270, B:183:0x0275, B:185:0x0279, B:186:0x027e, B:187:0x0285, B:189:0x028b, B:194:0x02a5, B:196:0x02a9, B:198:0x02b0, B:200:0x02b4, B:201:0x02b9, B:203:0x02bd, B:204:0x02c2, B:205:0x02c9, B:207:0x02cf, B:215:0x02f2, B:217:0x0300, B:219:0x030d, B:221:0x0311, B:224:0x0316, B:226:0x0319, B:228:0x031d, B:231:0x0325, B:233:0x0330, B:235:0x0334, B:238:0x0339, B:240:0x033c, B:243:0x0344, B:245:0x034c, B:247:0x0357, B:249:0x035b, B:252:0x0362, B:254:0x0365, B:256:0x036a, B:257:0x0370, B:259:0x0378, B:261:0x0383, B:263:0x0387, B:266:0x038e, B:268:0x0391, B:270:0x0396, B:272:0x039d, B:274:0x03a1, B:282:0x03b8, B:284:0x03bc, B:286:0x03c0, B:288:0x03c4, B:290:0x03c8, B:292:0x03cc, B:294:0x03d0, B:296:0x03d4, B:299:0x03de, B:301:0x03e2, B:303:0x03e6, B:307:0x03f6, B:309:0x03ff, B:311:0x0403, B:312:0x0407, B:313:0x040b, B:315:0x041e, B:319:0x0428, B:320:0x042c, B:324:0x0436, B:325:0x0439, B:328:0x0441, B:330:0x044c, B:332:0x0450, B:334:0x0455, B:338:0x0471, B:339:0x047b, B:342:0x0482, B:346:0x048c, B:351:0x0498, B:353:0x049e, B:355:0x04a2, B:356:0x04a4, B:358:0x04ac, B:360:0x04b0, B:361:0x04b4, B:364:0x04c3, B:365:0x04cd, B:366:0x04d0, B:368:0x04d4, B:369:0x04dd, B:372:0x04e3, B:373:0x04ee, B:376:0x04fd, B:378:0x0504, B:380:0x050d, B:383:0x0513, B:384:0x0518, B:385:0x051d, B:387:0x0521, B:388:0x0526, B:389:0x052d, B:392:0x0535, B:394:0x053e, B:399:0x0552, B:400:0x0557, B:401:0x055c, B:402:0x0567, B:403:0x056c, B:404:0x0571, B:413:0x059c, B:414:0x05a0, B:416:0x05a6, B:420:0x05b8, B:422:0x05c1, B:425:0x05d0, B:427:0x05d4, B:428:0x05d8), top: B:459:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x04c3 A[Catch: all -> 0x0185, Exception -> 0x018b, TryCatch #7 {Exception -> 0x018b, all -> 0x0185, blocks: (B:107:0x0158, B:109:0x0173, B:111:0x0177, B:119:0x0191, B:121:0x0195, B:125:0x019e, B:126:0x01a2, B:128:0x01a8, B:134:0x01ba, B:136:0x01c0, B:138:0x01c5, B:139:0x01d5, B:141:0x01d9, B:143:0x01e9, B:145:0x01ed, B:146:0x01fd, B:148:0x0209, B:151:0x0212, B:153:0x0218, B:155:0x021f, B:157:0x0223, B:158:0x0228, B:160:0x022c, B:162:0x0233, B:163:0x0237, B:165:0x023d, B:176:0x0261, B:178:0x0265, B:180:0x026c, B:182:0x0270, B:183:0x0275, B:185:0x0279, B:186:0x027e, B:187:0x0285, B:189:0x028b, B:194:0x02a5, B:196:0x02a9, B:198:0x02b0, B:200:0x02b4, B:201:0x02b9, B:203:0x02bd, B:204:0x02c2, B:205:0x02c9, B:207:0x02cf, B:215:0x02f2, B:217:0x0300, B:219:0x030d, B:221:0x0311, B:224:0x0316, B:226:0x0319, B:228:0x031d, B:231:0x0325, B:233:0x0330, B:235:0x0334, B:238:0x0339, B:240:0x033c, B:243:0x0344, B:245:0x034c, B:247:0x0357, B:249:0x035b, B:252:0x0362, B:254:0x0365, B:256:0x036a, B:257:0x0370, B:259:0x0378, B:261:0x0383, B:263:0x0387, B:266:0x038e, B:268:0x0391, B:270:0x0396, B:272:0x039d, B:274:0x03a1, B:282:0x03b8, B:284:0x03bc, B:286:0x03c0, B:288:0x03c4, B:290:0x03c8, B:292:0x03cc, B:294:0x03d0, B:296:0x03d4, B:299:0x03de, B:301:0x03e2, B:303:0x03e6, B:307:0x03f6, B:309:0x03ff, B:311:0x0403, B:312:0x0407, B:313:0x040b, B:315:0x041e, B:319:0x0428, B:320:0x042c, B:324:0x0436, B:325:0x0439, B:328:0x0441, B:330:0x044c, B:332:0x0450, B:334:0x0455, B:338:0x0471, B:339:0x047b, B:342:0x0482, B:346:0x048c, B:351:0x0498, B:353:0x049e, B:355:0x04a2, B:356:0x04a4, B:358:0x04ac, B:360:0x04b0, B:361:0x04b4, B:364:0x04c3, B:365:0x04cd, B:366:0x04d0, B:368:0x04d4, B:369:0x04dd, B:372:0x04e3, B:373:0x04ee, B:376:0x04fd, B:378:0x0504, B:380:0x050d, B:383:0x0513, B:384:0x0518, B:385:0x051d, B:387:0x0521, B:388:0x0526, B:389:0x052d, B:392:0x0535, B:394:0x053e, B:399:0x0552, B:400:0x0557, B:401:0x055c, B:402:0x0567, B:403:0x056c, B:404:0x0571, B:413:0x059c, B:414:0x05a0, B:416:0x05a6, B:420:0x05b8, B:422:0x05c1, B:425:0x05d0, B:427:0x05d4, B:428:0x05d8), top: B:459:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x05b8 A[Catch: all -> 0x0185, Exception -> 0x018b, TRY_ENTER, TryCatch #7 {Exception -> 0x018b, all -> 0x0185, blocks: (B:107:0x0158, B:109:0x0173, B:111:0x0177, B:119:0x0191, B:121:0x0195, B:125:0x019e, B:126:0x01a2, B:128:0x01a8, B:134:0x01ba, B:136:0x01c0, B:138:0x01c5, B:139:0x01d5, B:141:0x01d9, B:143:0x01e9, B:145:0x01ed, B:146:0x01fd, B:148:0x0209, B:151:0x0212, B:153:0x0218, B:155:0x021f, B:157:0x0223, B:158:0x0228, B:160:0x022c, B:162:0x0233, B:163:0x0237, B:165:0x023d, B:176:0x0261, B:178:0x0265, B:180:0x026c, B:182:0x0270, B:183:0x0275, B:185:0x0279, B:186:0x027e, B:187:0x0285, B:189:0x028b, B:194:0x02a5, B:196:0x02a9, B:198:0x02b0, B:200:0x02b4, B:201:0x02b9, B:203:0x02bd, B:204:0x02c2, B:205:0x02c9, B:207:0x02cf, B:215:0x02f2, B:217:0x0300, B:219:0x030d, B:221:0x0311, B:224:0x0316, B:226:0x0319, B:228:0x031d, B:231:0x0325, B:233:0x0330, B:235:0x0334, B:238:0x0339, B:240:0x033c, B:243:0x0344, B:245:0x034c, B:247:0x0357, B:249:0x035b, B:252:0x0362, B:254:0x0365, B:256:0x036a, B:257:0x0370, B:259:0x0378, B:261:0x0383, B:263:0x0387, B:266:0x038e, B:268:0x0391, B:270:0x0396, B:272:0x039d, B:274:0x03a1, B:282:0x03b8, B:284:0x03bc, B:286:0x03c0, B:288:0x03c4, B:290:0x03c8, B:292:0x03cc, B:294:0x03d0, B:296:0x03d4, B:299:0x03de, B:301:0x03e2, B:303:0x03e6, B:307:0x03f6, B:309:0x03ff, B:311:0x0403, B:312:0x0407, B:313:0x040b, B:315:0x041e, B:319:0x0428, B:320:0x042c, B:324:0x0436, B:325:0x0439, B:328:0x0441, B:330:0x044c, B:332:0x0450, B:334:0x0455, B:338:0x0471, B:339:0x047b, B:342:0x0482, B:346:0x048c, B:351:0x0498, B:353:0x049e, B:355:0x04a2, B:356:0x04a4, B:358:0x04ac, B:360:0x04b0, B:361:0x04b4, B:364:0x04c3, B:365:0x04cd, B:366:0x04d0, B:368:0x04d4, B:369:0x04dd, B:372:0x04e3, B:373:0x04ee, B:376:0x04fd, B:378:0x0504, B:380:0x050d, B:383:0x0513, B:384:0x0518, B:385:0x051d, B:387:0x0521, B:388:0x0526, B:389:0x052d, B:392:0x0535, B:394:0x053e, B:399:0x0552, B:400:0x0557, B:401:0x055c, B:402:0x0567, B:403:0x056c, B:404:0x0571, B:413:0x059c, B:414:0x05a0, B:416:0x05a6, B:420:0x05b8, B:422:0x05c1, B:425:0x05d0, B:427:0x05d4, B:428:0x05d8), top: B:459:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x05d0 A[Catch: all -> 0x0185, Exception -> 0x018b, TRY_ENTER, TryCatch #7 {Exception -> 0x018b, all -> 0x0185, blocks: (B:107:0x0158, B:109:0x0173, B:111:0x0177, B:119:0x0191, B:121:0x0195, B:125:0x019e, B:126:0x01a2, B:128:0x01a8, B:134:0x01ba, B:136:0x01c0, B:138:0x01c5, B:139:0x01d5, B:141:0x01d9, B:143:0x01e9, B:145:0x01ed, B:146:0x01fd, B:148:0x0209, B:151:0x0212, B:153:0x0218, B:155:0x021f, B:157:0x0223, B:158:0x0228, B:160:0x022c, B:162:0x0233, B:163:0x0237, B:165:0x023d, B:176:0x0261, B:178:0x0265, B:180:0x026c, B:182:0x0270, B:183:0x0275, B:185:0x0279, B:186:0x027e, B:187:0x0285, B:189:0x028b, B:194:0x02a5, B:196:0x02a9, B:198:0x02b0, B:200:0x02b4, B:201:0x02b9, B:203:0x02bd, B:204:0x02c2, B:205:0x02c9, B:207:0x02cf, B:215:0x02f2, B:217:0x0300, B:219:0x030d, B:221:0x0311, B:224:0x0316, B:226:0x0319, B:228:0x031d, B:231:0x0325, B:233:0x0330, B:235:0x0334, B:238:0x0339, B:240:0x033c, B:243:0x0344, B:245:0x034c, B:247:0x0357, B:249:0x035b, B:252:0x0362, B:254:0x0365, B:256:0x036a, B:257:0x0370, B:259:0x0378, B:261:0x0383, B:263:0x0387, B:266:0x038e, B:268:0x0391, B:270:0x0396, B:272:0x039d, B:274:0x03a1, B:282:0x03b8, B:284:0x03bc, B:286:0x03c0, B:288:0x03c4, B:290:0x03c8, B:292:0x03cc, B:294:0x03d0, B:296:0x03d4, B:299:0x03de, B:301:0x03e2, B:303:0x03e6, B:307:0x03f6, B:309:0x03ff, B:311:0x0403, B:312:0x0407, B:313:0x040b, B:315:0x041e, B:319:0x0428, B:320:0x042c, B:324:0x0436, B:325:0x0439, B:328:0x0441, B:330:0x044c, B:332:0x0450, B:334:0x0455, B:338:0x0471, B:339:0x047b, B:342:0x0482, B:346:0x048c, B:351:0x0498, B:353:0x049e, B:355:0x04a2, B:356:0x04a4, B:358:0x04ac, B:360:0x04b0, B:361:0x04b4, B:364:0x04c3, B:365:0x04cd, B:366:0x04d0, B:368:0x04d4, B:369:0x04dd, B:372:0x04e3, B:373:0x04ee, B:376:0x04fd, B:378:0x0504, B:380:0x050d, B:383:0x0513, B:384:0x0518, B:385:0x051d, B:387:0x0521, B:388:0x0526, B:389:0x052d, B:392:0x0535, B:394:0x053e, B:399:0x0552, B:400:0x0557, B:401:0x055c, B:402:0x0567, B:403:0x056c, B:404:0x0571, B:413:0x059c, B:414:0x05a0, B:416:0x05a6, B:420:0x05b8, B:422:0x05c1, B:425:0x05d0, B:427:0x05d4, B:428:0x05d8), top: B:459:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0602 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103 A[Catch: all -> 0x0091, Exception -> 0x0096, TRY_ENTER, TryCatch #8 {Exception -> 0x0096, all -> 0x0091, blocks: (B:40:0x0089, B:42:0x008d, B:47:0x009b, B:51:0x00aa, B:53:0x00b3, B:57:0x00c4, B:60:0x00cb, B:62:0x00d2, B:64:0x00d6, B:68:0x00e0, B:71:0x00e5, B:72:0x00e9, B:74:0x00f0, B:75:0x00f8, B:80:0x0103, B:81:0x0107, B:83:0x010d, B:90:0x0126), top: B:457:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0126 A[Catch: all -> 0x0091, Exception -> 0x0096, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0096, all -> 0x0091, blocks: (B:40:0x0089, B:42:0x008d, B:47:0x009b, B:51:0x00aa, B:53:0x00b3, B:57:0x00c4, B:60:0x00cb, B:62:0x00d2, B:64:0x00d6, B:68:0x00e0, B:71:0x00e5, B:72:0x00e9, B:74:0x00f0, B:75:0x00f8, B:80:0x0103, B:81:0x0107, B:83:0x010d, B:90:0x0126), top: B:457:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0139  */
    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r38, java.lang.Object r39, java.lang.Object r40, java.lang.reflect.Type r41) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.JavaBeanSerializer.write(com.alibaba.fastjson.serializer.JSONSerializer, java.lang.Object, java.lang.Object, java.lang.reflect.Type):void");
    }

    public JavaBeanSerializer(Class<?> cls, PropertyNamingStrategy propertyNamingStrategy) {
        this(cls, cls.getModifiers(), null, false, true, true, true, propertyNamingStrategy);
    }

    public JavaBeanSerializer(Class<?> cls, String... strArr) {
        this(cls, cls.getModifiers(), map(strArr), false, true, true, true, null);
    }

    public JavaBeanSerializer(Class<?> cls, int i, Map<String, String> map, boolean z, boolean z2, boolean z3, boolean z4, PropertyNamingStrategy propertyNamingStrategy) {
        String str;
        String str2;
        PropertyNamingStrategy propertyNamingStrategy2;
        this.features = 0;
        String[] strArr = null;
        JSONType jSONType = z2 ? (JSONType) cls.getAnnotation(JSONType.class) : null;
        if (jSONType != null) {
            this.features = SerializerFeature.of(jSONType.serialzeFeatures());
            str2 = jSONType.typeName();
            if (str2.length() == 0) {
                str2 = null;
                str = null;
            } else {
                str = null;
                for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    JSONType jSONType2 = (JSONType) superclass.getAnnotation(JSONType.class);
                    if (jSONType2 == null) {
                        break;
                    }
                    str = jSONType2.typeKey();
                    if (str.length() != 0) {
                        break;
                    }
                }
                for (Class<?> cls2 : cls.getInterfaces()) {
                    JSONType jSONType3 = (JSONType) cls2.getAnnotation(JSONType.class);
                    if (jSONType3 != null) {
                        str = jSONType3.typeKey();
                        if (str.length() != 0) {
                            break;
                        }
                    }
                }
                if (str != null && str.length() == 0) {
                    str = null;
                }
            }
            if (propertyNamingStrategy != null || (propertyNamingStrategy2 = jSONType.naming()) == PropertyNamingStrategy.CamelCase) {
                propertyNamingStrategy2 = propertyNamingStrategy;
            }
        } else {
            propertyNamingStrategy2 = propertyNamingStrategy;
            str2 = null;
            str = null;
        }
        this.typeName = str2;
        this.typeKey = str;
        List<FieldInfo> computeGetters = TypeUtils.computeGetters(cls, i, z, jSONType, map, false, z3, z4, propertyNamingStrategy2);
        ArrayList arrayList = new ArrayList();
        for (FieldInfo fieldInfo : computeGetters) {
            arrayList.add(new FieldSerializer(fieldInfo));
        }
        FieldSerializer[] fieldSerializerArr = (FieldSerializer[]) arrayList.toArray(new FieldSerializer[arrayList.size()]);
        this.getters = fieldSerializerArr;
        strArr = jSONType != null ? jSONType.orders() : strArr;
        if (strArr == null || strArr.length == 0) {
            FieldSerializer[] fieldSerializerArr2 = new FieldSerializer[fieldSerializerArr.length];
            System.arraycopy(fieldSerializerArr, 0, fieldSerializerArr2, 0, fieldSerializerArr.length);
            Arrays.sort(fieldSerializerArr2);
            if (Arrays.equals(fieldSerializerArr2, fieldSerializerArr)) {
                this.sortedGetters = fieldSerializerArr;
            } else {
                this.sortedGetters = fieldSerializerArr2;
            }
        } else {
            List<FieldInfo> computeGetters2 = TypeUtils.computeGetters(cls, i, z, jSONType, map, true, z3, z4, propertyNamingStrategy2);
            ArrayList arrayList2 = new ArrayList();
            for (FieldInfo fieldInfo2 : computeGetters2) {
                arrayList2.add(new FieldSerializer(fieldInfo2));
            }
            this.sortedGetters = (FieldSerializer[]) arrayList2.toArray(new FieldSerializer[arrayList2.size()]);
        }
    }
}
