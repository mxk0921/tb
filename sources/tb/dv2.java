package tb;

import com.heytap.mcssdk.constant.MessageConstant$MessageType;
import com.heytap.msp.push.mode.BaseMode;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dv2 extends BaseMode {

    /* renamed from: a  reason: collision with root package name */
    public int f18088a;
    public String b;
    public int c = -2;
    public String d;

    static {
        t2o.a(612368408);
    }

    public static <T> String c(List<T> list) {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(t);
            sb.append("&");
        }
        return sb.toString();
    }

    public int a() {
        return this.f18088a;
    }

    public int b() {
        return this.c;
    }

    public void d(int i) {
        this.f18088a = i;
    }

    public void e(int i) {
        this.c = i;
    }

    public String getContent() {
        return this.b;
    }

    @Override // com.heytap.msp.push.mode.BaseMode
    public int getType() {
        return MessageConstant$MessageType.MESSAGE_CALL_BACK;
    }

    public void setAppPackage(String str) {
        this.d = str;
    }

    public void setContent(String str) {
        this.b = str;
    }

    public String toString() {
        return "CallBackResult{, mRegisterID='null', mSdkVersion='null', mCommand=" + this.f18088a + "', mContent='" + this.b + "', mAppPackage=" + this.d + "', mResponseCode=" + this.c + '}';
    }
}
