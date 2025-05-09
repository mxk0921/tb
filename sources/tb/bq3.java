package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.favoritesdk.goods.response.OriginCheckCollectResponseData;
import java.util.Arrays;
import tb.hs6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bq3 implements ljd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hs6 f16546a;
    public String b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements hs6.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(bq3 bq3Var) {
        }

        @Override // tb.hs6.a
        public mnd a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mnd) ipChange.ipc$dispatch("3c39fbea", new Object[]{this});
            }
            return new zp3();
        }
    }

    static {
        t2o.a(463470613);
        t2o.a(463470657);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.b;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7375121", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    @Override // tb.ljd
    public hs6 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hs6) ipChange.ipc$dispatch("11f65278", new Object[]{this});
        }
        hs6 hs6Var = this.f16546a;
        if (hs6Var != null) {
            return hs6Var;
        }
        String arrays = Arrays.toString(new String[]{this.b});
        qzo qzoVar = new qzo();
        qzoVar.h("mtop.taobao.mercury.checkCollect");
        qzoVar.i("2.0");
        qzoVar.m(OriginCheckCollectResponseData.class);
        qzoVar.j(true);
        qzoVar.k("ids", arrays).k("type", 1L);
        hs6 b = ls6.b(qzoVar, new a(this));
        this.f16546a = b;
        b.f(new eq3());
        return this.f16546a;
    }
}
