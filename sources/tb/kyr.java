package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kyr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RemoteBusiness f23006a;
    public MtopListener b;
    public final int c;

    static {
        t2o.a(668991549);
    }

    public kyr(int i) {
        this.c = i;
    }

    public void a(MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c984d15", new Object[]{this, mtopListener});
        } else {
            this.b = mtopListener;
        }
    }

    public void b(Object obj, int i, Object obj2, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203445ae", new Object[]{this, obj, new Integer(i), obj2, cls});
        } else if (obj2 != null && (obj2 instanceof IMTOPDataObject)) {
            RemoteBusiness remoteBusiness = (RemoteBusiness) RemoteBusiness.build(lvr.b, (IMTOPDataObject) obj2, (String) null).reqContext(obj);
            this.f23006a = remoteBusiness;
            int i2 = this.c;
            if (-1 != i2) {
                remoteBusiness.setSocketTimeoutMilliSecond(i2);
            }
            this.f23006a.setJsonType(JsonTypeEnum.ORIGINALJSON);
            MtopListener mtopListener = this.b;
            if (mtopListener != null) {
                this.f23006a.addListener(mtopListener);
                this.f23006a.registeListener(this.b);
            }
            if (jvr.p().h()) {
                this.f23006a.reqMethod(MethodEnum.POST);
            }
            this.f23006a.startRequest(i, cls);
        }
    }

    public kyr() {
        this.c = -1;
    }
}
