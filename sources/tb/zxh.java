package tb;

import android.graphics.Bitmap;
import com.alipay.ma.encode.InputParameters.Gen0InputParameters;
import com.alipay.ma.encode.InputParameters.Gen3InputParameters;
import com.alipay.ma.encode.InputParameters.LogoBWInputParameters;
import com.alipay.ma.encode.api.MaEncodeAPI;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zxh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217781);
    }

    public static Bitmap a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("fdc05e2e", new Object[]{new Integer(i), str});
        }
        gso.c("EncodeWrapper.encodeGen0:{size:" + i + ",text:" + str + "}", new Object[0]);
        return MaEncodeAPI.encodeMa2(new Gen0InputParameters(i, str));
    }

    public static Bitmap b(String str, Bitmap bitmap, int i, char c, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5dfbc443", new Object[]{str, bitmap, new Integer(i), new Character(c), new Integer(i2)});
        }
        gso.c("EncodeWrapper.encodeGen3:{_publicData:" + str + ",version:" + i2 + "}", new Object[0]);
        return MaEncodeAPI.encodeMa2(new Gen3InputParameters(str, bitmap, i, c, i2));
    }

    public static Bitmap c(String str, int i, Bitmap bitmap, int i2, int i3, char c, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9ef8cca1", new Object[]{str, new Integer(i), bitmap, new Integer(i2), new Integer(i3), new Character(c), new Integer(i4)});
        }
        gso.c("EncodeWrapper.encodeLogo:{content:" + str + ",version:" + i4 + "}", new Object[0]);
        return MaEncodeAPI.encodeMa2(new LogoBWInputParameters(str, -16777216, bitmap, i2, i3, c, i4));
    }
}
