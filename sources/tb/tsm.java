package tb;

import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import tb.cec;
import tb.mqu;
import tb.qle;
import tb.tpu;
import tb.ud0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class tsm implements rcd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int DX_TEMPLATE_IMAGE_SIZE = 600;
    public static final String TAG = "preloadService";

    /* renamed from: a  reason: collision with root package name */
    public qpu f28934a;
    public IMainFeedsViewService<?> b;
    public RecyclerView c;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Set<Integer> d = new LinkedHashSet();
    public final List<Integer> h = new ArrayList();
    public final int i = 6;
    public final b j = new b(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552835);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements cec.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28936a;

        public c(String str) {
            this.f28936a = str;
        }

        @Override // tb.cec.a
        public void onImageLoadFailed(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd6d6a1d", new Object[]{this, new Integer(i)});
                return;
            }
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, tsm.TAG, "onImageLoadFailed, errorCode" + i + ", url:" + this.f28936a, null, 4, null);
        }

        @Override // tb.cec.a
        public void onImageLoaded(String str, BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72686e27", new Object[]{this, str, bitmapDrawable});
                return;
            }
            ckf.g(str, "url");
            ckf.g(bitmapDrawable, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
        }
    }

    static {
        t2o.a(918552834);
        t2o.a(918552773);
    }

    public tsm() {
        ud0.a aVar = ud0.Companion;
        this.e = ((Boolean) aVar.b().c("weitao_switch.enablePreloadDressUpMainPic", Boolean.FALSE)).booleanValue();
        lpb b2 = aVar.b();
        Boolean bool = Boolean.TRUE;
        this.f = ((Boolean) b2.c("weitao_switch.enablePreloadDressUpFeedsPic", bool)).booleanValue();
        this.g = ((Boolean) aVar.b().c("weitao_switch.enableDXTemplateImageSize", bool)).booleanValue();
    }

    public static final /* synthetic */ List f(tsm tsmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("96cb4fbc", new Object[]{tsmVar});
        }
        return tsmVar.h;
    }

    public static final /* synthetic */ Set g(tsm tsmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("dd09b17a", new Object[]{tsmVar});
        }
        return tsmVar.d;
    }

    public static final /* synthetic */ void h(tsm tsmVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea96f991", new Object[]{tsmVar, new Integer(i)});
        } else {
            tsmVar.j(i);
        }
    }

    @Override // tb.rcd
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e362cf6d", new Object[]{this});
            return;
        }
        this.d.clear();
        this.j.removeCallbacksAndMessages(null);
    }

    public final BaseSectionModel<?> i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("d712438", new Object[]{this, new Integer(i)});
        }
        if (this.b == null) {
            qpu qpuVar = this.f28934a;
            if (qpuVar != null) {
                cfc infoFlowContext = ((g1c) qpuVar.getService(g1c.class)).getDressHostService().getInfoFlowContext();
                if (infoFlowContext != null) {
                    this.b = (IMainFeedsViewService) infoFlowContext.a(IMainFeedsViewService.class);
                }
            } else {
                ckf.y("turboEngineContext");
                throw null;
            }
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.b;
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.findItemDataByPosition(i);
        }
        return null;
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        ftm b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.f28934a = qpuVar;
        if (this.e && (b2 = itm.b("dressup")) != null) {
            b2.o(new oz7(qpuVar.getContext()));
        }
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        e();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/feeds/service/preload/PreloadService$preloadHandler$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            ckf.g(message, "msg");
            if (!tsm.f(tsm.this).isEmpty()) {
                int intValue = ((Number) tsm.f(tsm.this).remove(0)).intValue();
                if (!tsm.g(tsm.this).contains(Integer.valueOf(intValue))) {
                    tsm.g(tsm.this).add(Integer.valueOf(intValue));
                    tsm.h(tsm.this, intValue);
                }
                if (!tsm.f(tsm.this).isEmpty()) {
                    sendEmptyMessage(1);
                }
            }
        }
    }

    @Override // tb.rcd
    public void c(int i, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("575676c5", new Object[]{this, new Integer(i), recyclerView});
            return;
        }
        ckf.g(recyclerView, OrderConfigs.RECYCLERVIEW);
        if (this.f) {
            this.c = recyclerView;
            this.d.add(Integer.valueOf(i));
            aef aefVar = new aef(i + 1, i + this.i);
            ArrayList<Number> arrayList = new ArrayList();
            int i2 = 0;
            for (Integer num : aefVar) {
                i2++;
                if (i2 < 0) {
                    yz3.p();
                    throw null;
                } else if (!this.d.contains(Integer.valueOf(num.intValue()))) {
                    arrayList.add(num);
                }
            }
            for (Number number : arrayList) {
                int intValue = number.intValue();
                if (((ArrayList) this.h).size() >= this.i) {
                    ((ArrayList) this.h).remove(0);
                }
                ((ArrayList) this.h).add(Integer.valueOf(intValue));
                if (!this.j.hasMessages(1)) {
                    this.j.sendEmptyMessage(1);
                }
            }
        }
    }

    public final void j(int i) {
        BaseSubItemModel baseItemModel;
        JSONObject smartContent;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16da89ca", new Object[]{this, new Integer(i)});
            return;
        }
        BaseSectionModel<?> i2 = i(i);
        if (i2 != null) {
            try {
                BaseItemModel item = i2.getItem();
                if (item != null && (baseItemModel = item.getBaseItemModel(0)) != null && (smartContent = baseItemModel.getSmartContent()) != null && (jSONObject = smartContent.getJSONObject("main_image")) != null) {
                    mqu.a aVar = mqu.Companion;
                    int d = aVar.d(jSONObject.get(Constants.Name.IMAGE_QUALITY), 90);
                    float c2 = aVar.c(jSONObject.get("imageRatio"), 0.75f);
                    String string = jSONObject.getString("imageUrl");
                    if (string != null && string.length() > 0 && c2 > 0.0f) {
                        long currentTimeMillis = System.currentTimeMillis();
                        tpu.a aVar2 = tpu.Companion;
                        tpu.a.b(aVar2, TAG, "preload imageUrl:" + string + ", imageQuality:" + d + ", imageRatio:" + c2 + ", position:" + i, null, 4, null);
                        RecyclerView recyclerView = this.c;
                        ckf.d(recyclerView);
                        int width = recyclerView.getWidth() / 2;
                        int i3 = (int) (((float) width) / c2);
                        if (this.g) {
                            width = 600;
                            i3 = 600;
                        }
                        qpu qpuVar = this.f28934a;
                        if (qpuVar != null) {
                            qle.b bVar = new qle.b(qpuVar.getContext(), string);
                            ud0.Companion.c().a(bVar.m("q" + d).n(width).o("dressup", "dressup").l(i3).a(), new c(string));
                            tpu.a.b(aVar2, TAG, "preload imageUrl end, cost " + (System.currentTimeMillis() - currentTimeMillis), null, 4, null);
                        } else {
                            ckf.y("turboEngineContext");
                            throw null;
                        }
                    }
                    xhv xhvVar = xhv.INSTANCE;
                }
            } catch (Exception e) {
                tpu.Companion.a(TAG, "onPreload", e);
                xhv xhvVar2 = xhv.INSTANCE;
            }
        }
    }
}
