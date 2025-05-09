package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.memory.MemOnlyFailedException;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.loader.network.HttpCodeResponseException;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.phenix.request.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j1m extends vs1<dtl, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final PhenixCreator e;
    public final mle f;
    public final ouo g;
    public final a h;

    static {
        t2o.a(620757069);
    }

    public j1m(a aVar, PhenixCreator phenixCreator, mle mleVar, ouo ouoVar, mke mkeVar) {
        super(aVar);
        this.h = aVar;
        this.e = phenixCreator;
        this.f = mleVar;
        this.g = ouoVar;
        aVar.p(new n1m(aVar, phenixCreator.getMemCacheMissListener(), mkeVar));
    }

    public static /* synthetic */ Object ipc$super(j1m j1mVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 121203263) {
            return super.h();
        }
        if (hashCode == 1492595022) {
            return super.e((huo) objArr[0]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/phenix/chain/PhenixLastConsumer");
    }

    @Override // tb.vs1
    public kk4<dtl, a> e(huo huoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kk4) ipChange.ipc$dispatch("58f7314e", new Object[]{this, huoVar});
        }
        super.e(huoVar);
        mzm g = getContext().g();
        if (g != null) {
            ((n1m) g).j(huoVar);
        }
        return this;
    }

    @Override // tb.vs1
    public huo h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (huo) ipChange.ipc$dispatch("7396a3f", new Object[]{this});
        }
        if (!TextUtils.equals(this.h.V(), Thread.currentThread().getName()) || this.h.U() != Thread.currentThread().getId()) {
            return super.h();
        }
        return null;
    }

    @Override // tb.vs1
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d42ad49", new Object[]{this});
            return;
        }
        String O = getContext().O();
        System.currentTimeMillis();
        v0a.g(getContext().Y());
        v0a.i(getContext().Y());
        if (this.e.getCancelListener() != null) {
            this.e.getCancelListener().onHappen(new b1m(O, getContext().Q()));
        }
        v0a.h(getContext().Y());
        mle mleVar = this.f;
        if (mleVar != null) {
            mleVar.c(getContext().Y());
        }
        getContext().d();
    }

    @Override // tb.vs1
    public void k(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56abcc3", new Object[]{this, th});
            return;
        }
        a g = getContext();
        if (!s(g, th) && !(th instanceof MemOnlyFailedException)) {
            v0a.i(getContext().Y());
            if (this.e.getFailureListener() != null) {
                FailPhenixEvent failPhenixEvent = new FailPhenixEvent(g.Q());
                if (th != null && (th instanceof HttpCodeResponseException)) {
                    HttpCodeResponseException httpCodeResponseException = (HttpCodeResponseException) th;
                    failPhenixEvent.setHttpCode(httpCodeResponseException.getHttpCode());
                    failPhenixEvent.setHttpMessage(httpCodeResponseException.getMessage());
                }
                failPhenixEvent.setResultCode(404);
                failPhenixEvent.setUrl(getContext().O());
                this.e.getFailureListener().onHappen(failPhenixEvent);
            }
            v0a.h(getContext().Y());
            mle mleVar = this.f;
            if (mleVar != null) {
                mleVar.h(g.Y(), th);
            }
        }
    }

    @Override // tb.vs1
    public void m(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c7464", new Object[]{this, new Float(f)});
        } else if (this.e.getProgressListener() != null) {
            l0n l0nVar = new l0n(getContext().Q(), f);
            l0nVar.setUrl(getContext().O());
            this.e.getProgressListener().onHappen(l0nVar);
        }
    }

    public final void q(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e8b68d", new Object[]{this, new Long(j)});
        } else if (this.f != null) {
            ImageStatistics Y = getContext().Y();
            Y.B(r(j, false, true, getContext().d()));
            this.f.g(Y);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x0044;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(com.taobao.phenix.request.a r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.j1m.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "40491aad"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            r7 = 2
            r4[r7] = r8
            java.lang.Object r7 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001f:
            boolean r2 = r7.i0()
            if (r2 == 0) goto L_0x0026
            return r1
        L_0x0026:
            tb.dpe r2 = r7.G()
            java.lang.String r2 = r2.l()
            com.taobao.phenix.intf.PhenixCreator r3 = r6.e
            tb.qkd r3 = r3.getRetryHandlerOnFailure()
            if (r3 == 0) goto L_0x0043
            com.taobao.phenix.intf.PhenixCreator r4 = r6.e
            java.lang.String r3 = r3.getRetryUrl(r4, r8)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x009c
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            boolean r4 = r8 instanceof com.taobao.phenix.decode.DecodeException
            if (r4 == 0) goto L_0x009c
            com.taobao.phenix.decode.DecodeException r8 = (com.taobao.phenix.decode.DecodeException) r8
            tb.w3o r4 = r6.getContext()
            com.taobao.phenix.request.a r4 = (com.taobao.phenix.request.a) r4
            tb.dpe r4 = r4.G()
            boolean r5 = r8.isDataFromDisk()
            if (r5 == 0) goto L_0x006c
            com.taobao.phenix.decode.DecodeException$DecodedError r5 = com.taobao.phenix.decode.DecodeException.DecodedError.UNLINK_SO_ERROR
            com.taobao.phenix.decode.DecodeException$DecodedError r8 = r8.getDecodedError()
            if (r5 == r8) goto L_0x006c
            boolean r8 = r4.q()
            if (r8 != 0) goto L_0x006c
            r7.I0()
            goto L_0x006d
        L_0x006c:
            r2 = r3
        L_0x006d:
            boolean r8 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r3 = "_.avif"
            if (r8 != 0) goto L_0x007b
            boolean r8 = r2.endsWith(r3)
            if (r8 == 0) goto L_0x009b
        L_0x007b:
            com.taobao.phenix.intf.PhenixCreator r8 = r6.e
            tb.qkd r8 = r8.getRetryHandlerOnFailure()
            if (r8 == 0) goto L_0x009b
            android.util.Pair r8 = r8.getDefaultRetryUrlPair()
            if (r8 == 0) goto L_0x009b
            java.lang.Object r4 = r8.first
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x009b
            boolean r3 = r4.endsWith(r3)
            if (r3 == 0) goto L_0x009b
            java.lang.Object r8 = r8.second
            r3 = r8
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x009c
        L_0x009b:
            r3 = r2
        L_0x009c:
            boolean r8 = android.text.TextUtils.isEmpty(r3)
            if (r8 == 0) goto L_0x00a3
            return r1
        L_0x00a3:
            r7.q0(r3)
            com.taobao.phenix.intf.PhenixCreator r7 = r6.e
            r7.fetch()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j1m.s(com.taobao.phenix.request.a, java.lang.Throwable):boolean");
    }

    public final Map<String, Integer> r(long j, boolean z, boolean z2, int i) {
        StringBuilder sb;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eeb47ecb", new Object[]{this, new Long(j), new Boolean(z), new Boolean(z2), new Integer(i)});
        }
        HashMap hashMap = null;
        if (!(z || z2)) {
            return null;
        }
        int T = (int) (j - getContext().T());
        int a0 = getContext().a0() <= 0 ? 0 : (int) (j - getContext().a0());
        if (z) {
            sb = new StringBuilder(150);
            sb.append("User-Callback: ");
            sb.append(System.currentTimeMillis() - j);
            sb.append("\nTotal-Time: ");
            sb.append(T);
            sb.append("\nWait-Main: ");
            sb.append(a0);
            sb.append('\n');
        } else {
            sb = null;
        }
        if (z2) {
            hashMap = new HashMap();
        }
        for (Map.Entry<String, Long> entry : getContext().R().entrySet()) {
            String key = entry.getKey();
            int intValue = entry.getValue().intValue();
            if (z) {
                sb.append(key);
                sb.append(": ");
                if (intValue < 0) {
                    sb.append("Unknown(cause interrupted)");
                } else {
                    sb.append(intValue);
                }
                sb.append('\n');
            }
            if (intValue >= 0) {
                i2 += intValue;
                if (z2) {
                    hashMap.put(key, Integer.valueOf(intValue));
                }
            }
        }
        int i3 = i2 + a0;
        if (T < i3) {
            T = i3;
        }
        int i4 = (T - i2) - a0;
        if (z2) {
            hashMap.put("totalTime", Integer.valueOf(T));
            hashMap.put(ImageStatistics.KEY_SCHEDULE_TIME, Integer.valueOf(i4));
            mle mleVar = this.f;
            if (!(mleVar == null || this.g == null || i4 < mleVar.i())) {
                hashMap.put(ImageStatistics.KEY_MASTER_WAIT_SIZE, Integer.valueOf(this.g.f().c()));
                hashMap.put(ImageStatistics.KEY_NETWORK_WAIT_SIZE, Integer.valueOf(this.g.b().c()));
                hashMap.put(ImageStatistics.KEY_DECODE_WAIT_SIZE, Integer.valueOf(this.g.e().c()));
            }
            hashMap.put(ImageStatistics.KEY_WAIT_FOR_MAIN, Integer.valueOf(a0));
        }
        if (z) {
            sb.append("Schedule-Time: ");
            sb.append(i4);
        }
        if (s0m.B().c0()) {
            this.g.a().c();
        }
        return hashMap;
    }

    /* renamed from: p */
    public void l(dtl dtlVar, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f76db45", new Object[]{this, dtlVar, new Boolean(z)});
            return;
        }
        sz8.b("phenix", "ui " + getContext().d());
        long currentTimeMillis = System.currentTimeMillis();
        s8d<SuccPhenixEvent> successListener = this.e.getSuccessListener();
        v0a.i(getContext().Y());
        if (successListener != null) {
            SuccPhenixEvent succPhenixEvent = new SuccPhenixEvent(getContext().Q());
            succPhenixEvent.setDrawable(dtlVar);
            succPhenixEvent.setUrl(getContext().O());
            succPhenixEvent.setImmediate(dtlVar.h());
            succPhenixEvent.setIntermediate(true ^ z);
            succPhenixEvent.fromDisk(dtlVar.g());
            succPhenixEvent.fromSecondary(dtlVar.i());
            succPhenixEvent.setNeedRefresh(dtlVar.j());
            successListener.onHappen(succPhenixEvent);
        }
        if (!(dtlVar == null || dtlVar.getBitmap() == null)) {
            i = dtlVar.getBitmap().getByteCount();
            getContext().Y().z(i);
        }
        fiv.p("Phenix", "UI Thread Process CallBack End. callback duration = " + (System.currentTimeMillis() - currentTimeMillis) + ", bmpByteCount = " + i, getContext());
        sz8.e();
        v0a.h(getContext().Y());
        if (z) {
            q(currentTimeMillis);
        }
    }
}
