package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.ultron.MTBPresenter;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pyh extends ux {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<MTBPresenter> f26398a;
    public final String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopResponse f26399a;

        public a(MtopResponse mtopResponse) {
            this.f26399a = mtopResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MTBPresenter mTBPresenter = (MTBPresenter) pyh.o(pyh.this).get();
            if (mTBPresenter != null) {
                mTBPresenter.B(pyh.p(pyh.this), this.f26399a);
            }
        }
    }

    static {
        t2o.a(745538062);
    }

    public pyh(String str, MTBPresenter mTBPresenter) {
        this.b = str;
        this.f26398a = new WeakReference<>(mTBPresenter);
    }

    public static /* synthetic */ Object ipc$super(pyh pyhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/MainApiAsyncRequestCallback");
    }

    public static /* synthetic */ WeakReference o(pyh pyhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("fd959a54", new Object[]{pyhVar});
        }
        return pyhVar.f26398a;
    }

    public static /* synthetic */ String p(pyh pyhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c44464b9", new Object[]{pyhVar});
        }
        return pyhVar.b;
    }

    @Override // tb.ojd
    public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
        } else {
            uuu.a(new a(mtopResponse));
        }
    }

    @Override // tb.ojd
    public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            return;
        }
        MTBPresenter mTBPresenter = this.f26398a.get();
        if (mTBPresenter != null) {
            mTBPresenter.a0(this.b, mtopResponse, i, fsbVar);
            if (mtopResponse != null && mtopResponse.getBytedata() != null) {
                TLog.loge("mtbDataLink", "【非首次】主接口onResult success,data=".concat(new String(mtopResponse.getBytedata())));
            }
        }
    }

    @Override // tb.ux
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a41f8de", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
