package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vti implements r1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f30243a;
    public obq c;
    public q5d b = null;
    public final Map<r1e, q5d> d = new ConcurrentHashMap();
    public final AtomicBoolean e = new AtomicBoolean(false);

    static {
        t2o.a(491782700);
        t2o.a(491782723);
    }

    public vti(cfc cfcVar) {
        this.f30243a = cfcVar;
        fve.e(obq.SPLASH_BUSINESS_TAG, "MicroserviceTopViewResponderCenter -> MicroserviceTopViewCreator()");
    }

    @Override // tb.r1e
    public void a(q5d q5dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730c29da", new Object[]{this, q5dVar});
        } else {
            e(this.c, q5dVar);
        }
    }

    @Override // tb.r1e
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("476519df", new Object[]{this});
        }
        if (this.c == null) {
            return null;
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "MicroserviceTopViewResponderCenter#getAdSearchBoxMergeData -> ");
        return this.c.b();
    }

    @Override // tb.r1e
    public void d(q5d q5dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd7e293", new Object[]{this, q5dVar});
            return;
        }
        obq obqVar = this.c;
        if (obqVar != null) {
            obqVar.d(q5dVar);
            ((ConcurrentHashMap) this.d).remove(this.c);
            this.b = null;
        }
    }

    public final void e(r1e r1eVar, q5d q5dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1216e0a", new Object[]{this, r1eVar, q5dVar});
        } else if (q5dVar != null) {
            if (r1eVar == null) {
                this.b = q5dVar;
            } else if (!((ConcurrentHashMap) this.d).containsKey(r1eVar) || !((ConcurrentHashMap) this.d).containsValue(q5dVar)) {
                r1eVar.a(q5dVar);
                ((ConcurrentHashMap) this.d).put(r1eVar, q5dVar);
            }
        }
    }

    @Override // tb.r1e
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        obq obqVar = this.c;
        if (obqVar != null) {
            obqVar.onDestroy();
        }
    }

    @Override // tb.r1e
    public boolean expendTopViewRecord() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e64c398", new Object[]{this})).booleanValue();
        }
        if (this.c != null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "MicroserviceTopViewResponderCenter#expendTopViewRecord -> expendTopViewRecord ");
            return this.c.expendTopViewRecord();
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "MicroserviceTopViewResponderCenter#expendTopViewRecord -> false ");
        return false;
    }

    @Override // tb.r1e
    public void c(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e4bdcdb", new Object[]{this, iContainerDataModel});
        } else if (!this.e.get()) {
            this.e.set(true);
            if (this.c == null) {
                this.c = new obq(this.f30243a);
            }
            e(this.c, this.b);
            this.c.c(iContainerDataModel);
            this.e.set(false);
            fve.e(obq.SPLASH_BUSINESS_TAG, "MicroserviceTopViewResponderCenter#onUpdateSplashData ");
        }
    }
}
