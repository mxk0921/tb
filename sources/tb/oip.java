package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareContent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oip {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f25412a;
    public String b;
    public String c;
    public String d;
    public String e;

    static {
        t2o.a(352321712);
    }

    public ShareContent a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("4d2b3cf9", new Object[]{this});
        }
        ShareContent shareContent = new ShareContent();
        shareContent.imageUrl = this.f25412a;
        shareContent.businessId = this.b;
        shareContent.description = this.c;
        shareContent.url = this.d;
        shareContent.title = this.e;
        return shareContent;
    }

    public oip b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oip) ipChange.ipc$dispatch("66046554", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public oip c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oip) ipChange.ipc$dispatch("13272233", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public oip d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oip) ipChange.ipc$dispatch("2d78411b", new Object[]{this, str});
        }
        this.f25412a = str;
        return this;
    }

    public oip e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oip) ipChange.ipc$dispatch("d3ae269f", new Object[]{this, str});
        }
        this.d = str;
        return this;
    }

    public oip f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oip) ipChange.ipc$dispatch("32089857", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }
}
