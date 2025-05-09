package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FavoriteResultData;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.taobao.subservice.biz.collect.CollectServiceImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qte extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_INFLOWCOLLECTTAP = 905481484000375658L;
    public static final String TAG = "InflowCollectTap";

    /* renamed from: a  reason: collision with root package name */
    public long f26918a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements usc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(qte qteVar) {
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            }
        }

        @Override // tb.m5c
        public void q0(FavoriteResultData favoriteResultData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7700a9d", new Object[]{this, favoriteResultData});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements usc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(qte qteVar) {
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            }
        }

        @Override // tb.m5c
        public void q0(FavoriteResultData favoriteResultData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7700a9d", new Object[]{this, favoriteResultData});
            }
        }
    }

    static {
        t2o.a(491782312);
    }

    public static /* synthetic */ Object ipc$super(qte qteVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/collect/dx/InflowCollectTapEventHandler");
    }

    public final void a(boolean z, BaseSectionModel<?> baseSectionModel, JSONObject jSONObject, DXRuntimeContext dXRuntimeContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a38802", new Object[]{this, new Boolean(z), baseSectionModel, jSONObject, dXRuntimeContext});
            return;
        }
        if (z) {
            str = "Page_Home_Button_Fav";
        } else {
            str = "Page_Home_Button_Fav_Cancel";
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            fve.e(TAG, "collectItem is null");
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("clickParam");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            fve.e(TAG, "collectClickParam is null");
            return;
        }
        jSONObject2.put("arg1", (Object) str);
        cfc c = j18.c(dXRuntimeContext);
        vve.l(c, dXRuntimeContext.L(), baseSectionModel, jSONObject, null);
        hue.d(c, baseSectionModel, jSONObject);
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXRuntimeContext == null || objArr.length <= 0) {
            fve.e(TAG, "param is error");
        } else if (!ehw.a(this.f26918a)) {
            this.f26918a = SystemClock.uptimeMillis();
            BaseSectionModel<?> e = j18.e(dXRuntimeContext);
            if (e == null) {
                fve.e(TAG, "card is null");
                return;
            }
            String str = (String) j18.a(objArr, 0, String.class);
            if (TextUtils.isEmpty(str)) {
                fve.e(TAG, "itemId is null");
                return;
            }
            Boolean castToBoolean = TypeUtils.castToBoolean(j18.b(e, CollectServiceImpl.KEY_COLLECT_STATUS));
            if (castToBoolean == null) {
                castToBoolean = Boolean.FALSE;
            }
            h39 a2 = h39.a(str, "ITEM");
            a2.f20385a = "recommend";
            if (castToBoolean.booleanValue()) {
                oii.c().j(a2, new a(this));
            } else {
                oii.c().b(a2, new b(this));
            }
            j18.f(e, CollectServiceImpl.KEY_COLLECT_STATUS, String.valueOf(!castToBoolean.booleanValue()));
            j18.f(e, "collectStatusChange", "true");
            ja6.b(CollectServiceImpl.USERID_COLLECT_VIEW, dXRuntimeContext.L());
            a(!castToBoolean.booleanValue(), e, (JSONObject) j18.a(objArr, 1, JSONObject.class), dXRuntimeContext);
        }
    }
}
