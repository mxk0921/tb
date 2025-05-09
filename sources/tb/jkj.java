package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.bridge.MUSThreadStrategy;
import com.taobao.android.weex_framework.module.MUSModule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class jkj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tvh f22037a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ cwh d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ MUSModule f;
        public final /* synthetic */ MUSValue[] g;

        public a(cwh cwhVar, Object obj, MUSModule mUSModule, MUSValue[] mUSValueArr) {
            this.d = cwhVar;
            this.e = obj;
            this.f = mUSModule;
            this.g = mUSValueArr;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/musadapter/NativeInvokeHelperAdapter$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.d.b(jkj.a(jkj.this), this.e, this.f, this.g);
                f9x.i(currentTimeMillis, this.f, this.d, jkj.a(jkj.this).j());
            } catch (Exception e) {
                dwh.h(String.format("[CallMUSModule] call %s#%s() err", this.f.getModuleName(), this.d), e);
            }
        }
    }

    static {
        t2o.a(982515940);
    }

    public jkj(tvh tvhVar) {
        this.f22037a = tvhVar;
    }

    public static /* synthetic */ tvh a(jkj jkjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tvh) ipChange.ipc$dispatch("852e3933", new Object[]{jkjVar});
        }
        return jkjVar.f22037a;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    public <T extends MUSModule> Object b(T t, cwh<T> cwhVar, MUSValue[] mUSValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e6c2c1a0", new Object[]{this, t, cwhVar, mUSValueArr});
        }
        Object executeContext = this.f22037a.getExecuteContext();
        if (cwhVar.a() != MUSThreadStrategy.JS) {
            this.f22037a.postTaskToMain(new a(cwhVar, executeContext, t, mUSValueArr));
            return null;
        } else if (!hxh.a()) {
            try {
                return cwhVar.b(this.f22037a, executeContext, t, mUSValueArr);
            } catch (Exception e) {
                dwh.h(String.format("[CallMUSModule] call %s#%s() err", t.getModuleName(), cwhVar), e);
                return null;
            }
        } else {
            throw new IllegalStateException("invokeModuleMethod from none-js thread");
        }
    }
}
