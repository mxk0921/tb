package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class znf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286665);
    }

    public static void a(UltronInstanceConfig.ExposureStrategy exposureStrategy, ViewEngine viewEngine, f8v f8vVar, com.alibaba.android.ultron.vfw.instance.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec03e4cd", new Object[]{exposureStrategy, viewEngine, f8vVar, aVar});
        } else {
            viewEngine.f1(new a(exposureStrategy, f8vVar, aVar));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements jc4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final UltronInstanceConfig.ExposureStrategy f32890a;
        public final com.alibaba.android.ultron.vfw.instance.a b;
        public final f8v c;

        static {
            t2o.a(157286666);
            t2o.a(157286630);
        }

        public a(UltronInstanceConfig.ExposureStrategy exposureStrategy, f8v f8vVar, com.alibaba.android.ultron.vfw.instance.a aVar) {
            this.f32890a = exposureStrategy;
            this.c = f8vVar;
            this.b = aVar;
        }

        @Override // tb.jc4
        public void a(ViewGroup viewGroup, int i, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3caeab4", new Object[]{this, viewGroup, new Integer(i), map});
            }
        }

        public final void c(com.alibaba.android.ultron.vfw.instance.a aVar, IDMComponent iDMComponent) {
            ArrayMap<String, Object> extMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dccc07c8", new Object[]{this, aVar, iDMComponent});
            } else if (aVar != null && iDMComponent != null && "init".equals(esb.a(iDMComponent, "asyncStatus", "")) && (extMap = iDMComponent.getExtMap()) != null && extMap.get("lazyLoadStatus") == null) {
                aVar.Q(iDMComponent);
                iDMComponent.getExtMap().put("lazyLoadStatus", 1);
                String l = this.c.l();
                UnifyLog.m(l, "ItemExposureStrategy", "lazy component exposure so load " + iDMComponent.getKey(), new String[0]);
            }
        }

        @Override // tb.jc4
        public void b(RecyclerViewHolder recyclerViewHolder, IDMComponent iDMComponent, Map<String, Object> map) {
            Map<String, List<gsb>> eventMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e613c21", new Object[]{this, recyclerViewHolder, iDMComponent, map});
            } else if (iDMComponent != null && (eventMap = iDMComponent.getEventMap()) != null) {
                c(this.b, iDMComponent);
                List<gsb> list = eventMap.get("exposureItem");
                if (list != null) {
                    for (int i = 0; i < list.size(); i++) {
                        gsb gsbVar = list.get(i);
                        if (gsbVar != null) {
                            String type = gsbVar.getType();
                            if (!TextUtils.isEmpty(type)) {
                                if ("userTrack".equals(type)) {
                                    JSONObject fields = iDMComponent.getFields();
                                    if (fields != null && fields.containsKey("asyncStatus") && !"success".equals(fields.getString("asyncStatus"))) {
                                        String l = this.c.l();
                                        UnifyLog.m(l, "ItemExposureStrategy", "component asyncStatus is not success " + iDMComponent.getKey(), new String[0]);
                                    } else if (this.f32890a == UltronInstanceConfig.ExposureStrategy.EXPOSURE_ONCE && iDMComponent.getExtMap() != null) {
                                        if (iDMComponent.getExtMap().get("exposureCount") == null) {
                                            iDMComponent.getExtMap().put("exposureCount", 1);
                                        }
                                    }
                                }
                                b8v t = this.c.e().t(type);
                                t.p(iDMComponent);
                                if (map != null) {
                                    t.v(map);
                                }
                                t.A("exposureItem");
                                t.r(gsbVar);
                                String l2 = this.c.l();
                                UnifyLog.m(l2, "ItemExposureStrategy", "component exposure item:" + type + ", " + iDMComponent.getKey(), new String[0]);
                                this.c.k(t);
                            }
                        }
                    }
                }
            }
        }
    }
}
