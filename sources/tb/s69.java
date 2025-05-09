package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.festival.FestivalConfigLoader;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s69 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FESTIVAL_IMAGE_MODULE = "common";

    /* renamed from: a  reason: collision with root package name */
    public static final s69 f27821a = new s69();

    static {
        t2o.a(464519224);
    }

    public static s69 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s69) ipChange.ipc$dispatch("83905bd1", new Object[0]);
        }
        return f27821a;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a184fc7", new Object[]{this})).booleanValue();
        }
        return FestivalConfigLoader.m().j();
    }

    public int b(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd35252e", new Object[]{this, str, str2, new Integer(i)})).intValue();
        }
        String c = c(str, str2);
        if (TextUtils.isEmpty(c)) {
            return i;
        }
        try {
            return Color.parseColor(c);
        } catch (Exception unused) {
            return i;
        }
    }

    public String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6204afec", new Object[]{this, str, str2});
        }
        return FestivalConfigLoader.m().l(str, str2);
    }

    public int d(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e6486fb", new Object[]{this, str, new Integer(i)})).intValue();
        }
        String c = c("global", str);
        if (TextUtils.isEmpty(c)) {
            return i;
        }
        try {
            return Color.parseColor(c);
        } catch (Exception unused) {
            return i;
        }
    }

    public Map<String, String> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fc22d04a", new Object[]{this, str});
        }
        return FestivalConfigLoader.m().n(str);
    }

    public String g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aaf277a2", new Object[]{this, str, str2});
        }
        String c = c(str, str2);
        if (TextUtils.isEmpty(c)) {
            return "";
        }
        return c;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            FestivalConfigLoader.m().o();
        }
    }

    public boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f24a39f8", new Object[]{this, str})).booleanValue();
        }
        return FestivalConfigLoader.m().s(str);
    }

    public boolean j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cb84ec2", new Object[]{this, str, str2})).booleanValue();
        }
        return !TextUtils.isEmpty(c(str, str2));
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf67b2c", new Object[]{this});
        } else {
            FestivalConfigLoader.m().y(true);
        }
    }
}
