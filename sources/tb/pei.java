package tb;

import android.content.ContentUris;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.taobao.tao.shop.common.ShopConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class pei {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f26044a;
    public final String b;
    public final int c;
    public boolean d;
    public String e;
    public final long f;
    public String g;
    public long h;
    public int i;
    public Uri j;
    public final boolean k;

    static {
        t2o.a(481296466);
    }

    public pei(long j, String str, int i, long j2, boolean z) {
        this.f26044a = j;
        this.b = str;
        this.c = i;
        this.f = j2;
        this.k = z;
    }

    public static String l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72f8c33e", new Object[]{new Integer(i)});
        }
        if (i >= 10) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    public pei a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pei) ipChange.ipc$dispatch("cdadbbc1", new Object[]{this});
        }
        pei peiVar = new pei(this.f26044a, this.b, this.c, this.f, this.k);
        peiVar.d = this.d;
        peiVar.e = this.e;
        peiVar.g = this.g;
        peiVar.h = this.h;
        peiVar.i = this.i;
        peiVar.j = this.j;
        return peiVar;
    }

    public Uri b() {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("ef4f45ba", new Object[]{this});
        }
        Uri uri2 = this.j;
        if (uri2 != null) {
            return uri2;
        }
        if (p()) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        return ContentUris.withAppendedId(uri, this.f26044a);
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6a32a9f", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e7ace2f", new Object[]{this});
        }
        return this.g;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0c", new Object[]{this})).longValue();
        }
        return this.f26044a;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this});
        }
        return this.b;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("265b2898", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("119e3734", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.b)) {
            return FactoryType.TYPE_INVALID;
        }
        if (!this.k) {
            return "unknown";
        }
        if (this.b.contains("com.ss.android.ugc.aweme")) {
            return "douyin";
        }
        if (this.b.contains("com.xunmeng.pinduoduo")) {
            return "pinduoduo";
        }
        if (this.b.contains("com.xingin.xhs")) {
            return "xiaohongshu";
        }
        if (this.b.contains("com.taobao.taobao")) {
            return "taobao";
        }
        if (this.b.contains("com.smile.gifmaker")) {
            return "kuaishou";
        }
        if (this.b.contains("com.jingdong.app.mall")) {
            return "jingdong";
        }
        if (this.b.contains("com.shizhuang.duapp")) {
            return "dewu";
        }
        if (this.b.contains("com.achievo.vipshop")) {
            return "weipinhui";
        }
        if (this.b.contains("com.dangdang.buy2")) {
            return "dangdang";
        }
        if (this.b.contains("com.taobao.idlefish")) {
            return "xianyu";
        }
        if (this.b.contains("com.")) {
            return "other";
        }
        return "";
    }

    public long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eaa1be44", new Object[]{this})).longValue();
        }
        return this.h;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33120a83", new Object[]{this});
        }
        return this.e;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b1bd2db", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c89dfa5d", new Object[]{this})).booleanValue();
        }
        if (this.h <= 0) {
            return true;
        }
        return false;
    }

    public boolean o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7be089ae", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.h <= i) {
            return true;
        }
        return false;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("959e257c", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc2c00a", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void r(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc764036", new Object[]{this, uri});
        } else {
            this.j = uri;
        }
    }

    public final String s() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2dae4a80", new Object[]{this});
        }
        int i2 = (int) this.h;
        int i3 = i2 / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
        int i4 = (i2 - (i3 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT)) / 60;
        String str = l(i4) + ":" + l(i - (i4 * 60));
        if (i3 == 0) {
            return str;
        }
        return l(i3) + ":" + str;
    }

    public pei(long j, String str, String str2, long j2, long j3, boolean z) {
        this.k = false;
        this.f26044a = j;
        this.b = str;
        this.e = str2;
        this.f = j2;
        String str3 = Build.BRAND;
        if (z || (!"Xiaomi".equals(str3) && !"Redmi".equals(str3))) {
            this.h = j3 / 1000;
        } else {
            this.h = j3;
        }
        this.g = s();
        this.d = true;
    }
}
