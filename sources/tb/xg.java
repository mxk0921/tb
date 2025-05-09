package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.service.cache.AURACacheInput;
import com.alibaba.android.aura.service.cache.AURACacheOutput;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class xg extends bp<AURACacheInput, AURACacheOutput> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public wg c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pt f31367a;
        public final /* synthetic */ AURACacheInput b;
        public final /* synthetic */ AURAInputData c;

        public a(pt ptVar, AURACacheInput aURACacheInput, AURAInputData aURAInputData) {
            this.f31367a = ptVar;
            this.b = aURACacheInput;
            this.c = aURAInputData;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (xg.L(xg.this) != null && this.f31367a != null) {
                try {
                    this.f31367a.c(yk.a(new AURACacheOutput(xg.L(xg.this).b(this.b.cacheKey)), this.c));
                } catch (Exception e) {
                    rbb g = ck.g();
                    g.e("缓存读取出错：" + e.getMessage());
                }
            }
        }
    }

    static {
        t2o.a(80740422);
    }

    public static /* synthetic */ wg L(xg xgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wg) ipChange.ipc$dispatch("42ca8f13", new Object[]{xgVar});
        }
        return xgVar.c;
    }

    public static /* synthetic */ Object ipc$super(xg xgVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -576780562) {
            super.B((AURAInputData) objArr[0], (pt) objArr[1]);
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/service/cache/AURACacheService");
        }
    }

    @Override // tb.bp
    public void B(AURAInputData<AURACacheInput> aURAInputData, pt<AURACacheOutput> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9f06ee", new Object[]{this, aURAInputData, ptVar});
            return;
        }
        super.B(aURAInputData, ptVar);
        AURACacheInput data = aURAInputData.getData();
        int i = data.operatorType;
        if (i == 0) {
            dn.h(new a(ptVar, data, aURAInputData));
        } else if (i == 1) {
            Object obj = data.cacheObject;
            this.c.e(data.cacheKey, obj);
            ptVar.c(yk.a(new AURACacheOutput(obj), aURAInputData));
        }
    }

    @Override // tb.gn, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        this.c = new wg("AURA_" + loVar.d());
    }

    @Override // tb.gn, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        wg wgVar = this.c;
        if (wgVar != null) {
            wgVar.d();
        }
    }
}
