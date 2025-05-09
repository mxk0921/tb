package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class u4v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final u4v e = new u4v();

    /* renamed from: a  reason: collision with root package name */
    public String f29144a = null;
    public String b = null;
    public String c = null;
    public String d = null;

    static {
        t2o.a(962593181);
    }

    public static u4v getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u4v) ipChange.ipc$dispatch("742c75c1", new Object[0]);
        }
        return e;
    }

    public String getBackupH5Url() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48bd8daf", new Object[]{this});
        }
        return this.d;
    }

    public String getH5RefPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80a3eada", new Object[]{this});
        }
        return this.f29144a;
    }

    public String getH5Url() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abc85acd", new Object[]{this});
        }
        return this.c;
    }

    public String getRefPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("523494ed", new Object[]{this});
        }
        return this.b;
    }

    public void setBackupH5Url(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ab570f", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void setH5RefPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16172c44", new Object[]{this, str});
        } else {
            this.f29144a = str;
        }
    }

    public void setH5Url(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1b94b1", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void setRefPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb619191", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }
}
