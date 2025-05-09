package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ycv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f31992a = "ultronX_android";
    public static final String b = "ultronX_whitelist";
    public static final String c = MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5865b52", new Object[]{str})).booleanValue();
        }
        if (JSON.parseArray(v9v.g(f31992a, b, c)).contains(str)) {
            return true;
        }
        return false;
    }

    static {
        t2o.a(83886367);
    }
}
