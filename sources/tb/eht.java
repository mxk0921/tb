package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eht implements c4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(793772125);
        t2o.a(665845808);
    }

    @Override // tb.c4d
    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ed8371", new Object[]{this, str, str2});
        }
        if (!"android_share".equals(str) || !"newsharecheck".equals(str2)) {
            return null;
        }
        return "{\"path\":\"2\",\"regexList\":[\"[￥](.*?)[￥]|[()/￥€£₴$₰¢₤¥₳₲₪₵《\\ud83d\\udd11\\ud83d\\udddd\\ud83d\\ude3a\\ud83d\\ude38\\ud83c\\udf81\\ud83d\\udcf2\\ud83d\\udcb0\\ud83d\\udcb2\\u2714\\ud83c\\udfb5\\ud83d\\udd10][A-Za-z0-9]{7,15}[()/￥€£₴$₰¢₤¥₳₲₪₵《\\ud83d\\udd11\\ud83d\\udddd\\ud83d\\ude3a\\ud83d\\ude38\\ud83c\\udf81\\ud83d\\udcf2\\ud83d\\udcb0\\ud83d\\udcb2\\u2714\\ud83c\\udfb5\\ud83d\\udd10]\"]}";
    }
}
