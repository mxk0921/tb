package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kh6 extends l10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVE_PRESALE = 5811354893753556959L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements l8d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiveItem f22665a;
        public final /* synthetic */ xea b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ long d;

        /* compiled from: Taobao */
        /* renamed from: tb.kh6$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C0970a extends d47 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0970a() {
            }

            public static /* synthetic */ Object ipc$super(C0970a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTblive_presaleEventHandler$1$1");
            }

            @Override // tb.d47, tb.b0d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    a1u.a(a.this.c, "活动太火爆了，再试一次");
                }
            }

            @Override // tb.d47, tb.b0d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    return;
                }
                if (!(netResponse == null || netResponse.getDataJsonObject() == null)) {
                    try {
                        if (netResponse.getDataJsonObject().getBoolean("result")) {
                            a.this.f22665a.itemExtData.put("subscribeStatus", (Object) "1");
                            a aVar = a.this;
                            pfa.Z(aVar.f22665a, aVar.b);
                            a1u.a(a.this.c, "设置提醒成功，可在手机日历自行关闭提醒");
                            return;
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                a1u.a(a.this.c, "活动太火爆了，再试一次");
            }
        }

        public a(kh6 kh6Var, LiveItem liveItem, xea xeaVar, Context context, long j) {
            this.f22665a = liveItem;
            this.b = xeaVar;
            this.c = context;
            this.d = j;
        }

        @Override // tb.l8d
        public void onDenied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
            } else {
                a1u.a(this.c, "请授权日历权限！");
            }
        }

        @Override // tb.l8d
        public void onGranted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48392e63", new Object[]{this});
            } else {
                new kfa(new C0970a()).K(this.d, this.f22665a.itemId, true, "preSale");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements l8d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f22667a;
        public final /* synthetic */ LiveItem b;
        public final /* synthetic */ xea c;
        public final /* synthetic */ long d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a extends d47 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTblive_presaleEventHandler$2$1");
            }

            @Override // tb.d47, tb.b0d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    a1u.a(b.this.f22667a, "取消预约失败，再试一次");
                }
            }

            @Override // tb.d47, tb.b0d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    return;
                }
                a1u.a(b.this.f22667a, "已取消付定提醒");
                b.this.b.itemExtData.put("subscribeStatus", (Object) "0");
                b bVar = b.this;
                pfa.Z(bVar.b, bVar.c);
            }
        }

        public b(kh6 kh6Var, Context context, LiveItem liveItem, xea xeaVar, long j) {
            this.f22667a = context;
            this.b = liveItem;
            this.c = xeaVar;
            this.d = j;
        }

        @Override // tb.l8d
        public void onDenied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
            } else {
                a1u.a(this.f22667a, "请授权日历权限！");
            }
        }

        @Override // tb.l8d
        public void onGranted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48392e63", new Object[]{this});
            } else {
                new kfa(new a()).K(this.d, this.b.itemId, false, "preSale");
            }
        }
    }

    static {
        t2o.a(295698959);
    }

    public static /* synthetic */ Object ipc$super(kh6 kh6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTblive_presaleEventHandler");
    }

    public final void d(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2284e1", new Object[]{this, liveItem});
        } else if (kkr.i().o() != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            qfa.b(hashMap, liveItem);
            hashMap.put("itemtype", "1");
            kkr.i().o().c("newcart", hashMap);
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

    @Override // tb.l10
    public void c(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, xea xeaVar) {
        LiveItem liveItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86174a8b", new Object[]{this, dXEvent, objArr, dXRuntimeContext, xeaVar});
        } else if (objArr != null && objArr.length >= 2) {
            JSONObject jSONObject = (JSONObject) objArr[0];
            Context h = dXRuntimeContext.h();
            if (jSONObject == null && TextUtils.equals("update", (String) objArr[1]) && dXRuntimeContext.L() != null) {
                jSONObject = dXRuntimeContext.L().getData();
            }
            if (jSONObject != null && (liveItem = (LiveItem) fkx.f(jSONObject.toJSONString(), LiveItem.class)) != null && liveItem.itemExtData != null) {
                hha.c("Handler_presale", "handleEvent | args1=" + ((String) objArr[1]) + "    liveId=" + liveItem.liveId + "  itemId=" + liveItem.itemId);
                if (TextUtils.equals("subscribe", (String) objArr[1])) {
                    String string = liveItem.itemExtData.getString("subscribeStatus");
                    long longValue = liveItem.itemExtData.getLongValue("depositBegin");
                    long longValue2 = liveItem.itemExtData.getLongValue("depositEnd");
                    String str = "预售提醒：" + liveItem.itemName;
                    long h2 = zqq.h(liveItem.liveId);
                    String c = kkr.i().c(xeaVar);
                    d(liveItem);
                    if (!TextUtils.equals("1", string)) {
                        kkr.i().d().f(xeaVar == null ? null : xeaVar.q(), h, str, "https://h5.m.taobao.com/taolive/video.html?userId=" + c + "&livesource=presale_subscribe&sjsdItemId=" + liveItem.itemId, longValue, longValue2, 1L, new a(this, liveItem, xeaVar, h, h2));
                        return;
                    }
                    kkr.i().d().p(xeaVar == null ? null : xeaVar.q(), h, str, longValue, longValue2, new b(this, h, liveItem, xeaVar, h2));
                } else if (TextUtils.equals("update", (String) objArr[1])) {
                    pfa.Z(liveItem, xeaVar);
                }
            }
        }
    }
}
