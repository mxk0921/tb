package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.nav.Nav;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class eg6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVERECOMMENDCARDGOODSACTION = 5833227874115549025L;

    /* renamed from: a  reason: collision with root package name */
    public DXRuntimeContext f18554a;

    static {
        t2o.a(779092958);
    }

    public static /* synthetic */ Object ipc$super(eg6 eg6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/dx/DXTaoLiveRecommendCardGoodsActionEventHandler");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5604a1e", new Object[]{this});
        } else {
            ryg.b().c("com.taobao.taolive.room.recommend.good.card.update", this.f18554a);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                String str = (String) obj;
                str.hashCode();
                if (str.equals("bottomButtonClicked")) {
                    this.f18554a = dXRuntimeContext;
                    if (dXRuntimeContext != null) {
                        JSONObject i2 = dXRuntimeContext.i();
                        if (i2 == null || !TextUtils.equals(i2.getString("bottomType"), "2")) {
                            a();
                        } else {
                            Nav.from(dXRuntimeContext.h()).toUri(i2.getString("bottomUrl"));
                        }
                    } else {
                        a();
                    }
                    DXRuntimeContext dXRuntimeContext2 = this.f18554a;
                    if (dXRuntimeContext2 != null && (i = dXRuntimeContext2.i()) != null) {
                        String string = i.getString("bottomType");
                        HashMap hashMap = new HashMap();
                        hashMap.put("type", string);
                        hashMap.put("spm-cnt", rbu.r(vx9.d()));
                        hashMap.put("spm-url", up6.U(vx9.d()));
                        if (v2s.o().E() != null) {
                            v2s.o().E().track4Click("Page_TaobaoLiveWatch", "cardbottombtn", hashMap);
                        }
                    }
                } else if (str.equals("goodsCardClicked")) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof String) {
                        Nav.from(dXRuntimeContext.h()).toUri((String) obj2);
                    }
                    Object obj3 = objArr[2];
                    if (obj3 instanceof JSONObject) {
                        String string2 = ((JSONObject) obj3).getString("itemId");
                        String string3 = ((JSONObject) objArr[2]).getString("type");
                        String string4 = ((JSONObject) objArr[2]).getString("eventId");
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("itemid", string2);
                        hashMap2.put("type", string3);
                        hashMap2.put(UserTrackDO.COLUMN_EVENT_ID, string4);
                        hashMap2.put("spm-cnt", rbu.r(vx9.d()));
                        hashMap2.put("spm-url", up6.U(vx9.d()));
                        if (v2s.o().E() != null) {
                            v2s.o().E().track4Click("Page_TaobaoLiveWatch", "carditem", hashMap2);
                        }
                    }
                }
            }
        }
    }
}
