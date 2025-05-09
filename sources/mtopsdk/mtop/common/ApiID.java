package mtopsdk.mtop.common;

import android.os.Handler;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.f10;
import tb.hi9;
import tb.t2o;
import tb.ui9;
import tb.w4j;
import tb.zu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ApiID implements IMTOPDataObject {
    private static final String TAG = "mtopsdk.ApiID";
    private volatile zu2 call;
    private volatile boolean isCancelled = false;
    private w4j mtopContext;

    static {
        t2o.a(589299875);
        t2o.a(589299906);
    }

    public ApiID(zu2 zu2Var, w4j w4jVar) {
        this.call = zu2Var;
        this.mtopContext = w4jVar;
    }

    public boolean cancelApiCall() {
        if (this.call != null) {
            this.call.cancel();
            this.isCancelled = true;
        }
        return true;
    }

    public zu2 getCall() {
        return this.call;
    }

    public w4j getMtopContext() {
        return this.mtopContext;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public ApiID retryApiCall(Handler handler) {
        w4j w4jVar = this.mtopContext;
        if (w4jVar == null) {
            return null;
        }
        w4jVar.d.handler = handler;
        hi9 hi9Var = w4jVar.f30449a.getMtopConfig().filterManager;
        if (hi9Var != null) {
            ((f10) hi9Var).d(null, this.mtopContext);
        }
        ui9.a(hi9Var, this.mtopContext);
        return new ApiID(null, this.mtopContext);
    }

    public void setCall(zu2 zu2Var) {
        this.call = zu2Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("ApiID [call=");
        sb.append(this.call);
        sb.append(", mtopContext=");
        sb.append(this.mtopContext);
        sb.append("]");
        return sb.toString();
    }

    public ApiID retryApiCall() {
        return retryApiCall(null);
    }
}
