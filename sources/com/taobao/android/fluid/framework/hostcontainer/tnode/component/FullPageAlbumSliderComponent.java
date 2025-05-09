package com.taobao.android.fluid.framework.hostcontainer.tnode.component;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.hostcontainer.tnode.ProgressViewGroup;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.jfw;
import tb.nwv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FullPageAlbumSliderComponent extends Component<ProgressViewGroup, b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class IndicatorModel implements Serializable {
        public int count;
        public double interval;

        static {
            t2o.a(468714423);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ProgressViewGroup.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f7834a;
        public final /* synthetic */ ProgressViewGroup b;

        public a(b bVar, ProgressViewGroup progressViewGroup) {
            this.f7834a = bVar;
            this.b = progressViewGroup;
        }

        @Override // com.taobao.android.fluid.framework.hostcontainer.tnode.ProgressViewGroup.c
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("237695e6", new Object[]{this, new Integer(i)});
                return;
            }
            FullPageAlbumSliderComponent.h(FullPageAlbumSliderComponent.this, i);
            if (this.f7834a.z0) {
                this.b.selectIndex(i, true);
            } else {
                this.b.startProgress(i);
            }
        }
    }

    static {
        t2o.a(468714421);
    }

    public static /* synthetic */ void h(FullPageAlbumSliderComponent fullPageAlbumSliderComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee8b8ae", new Object[]{fullPageAlbumSliderComponent, new Integer(i)});
        } else {
            fullPageAlbumSliderComponent.j(i);
        }
    }

    public static /* synthetic */ Object ipc$super(FullPageAlbumSliderComponent fullPageAlbumSliderComponent, String str, Object... objArr) {
        if (str.hashCode() == -703216504) {
            super.applyAttrForView((View) objArr[0], (jfw) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/hostcontainer/tnode/component/FullPageAlbumSliderComponent");
    }

    public final void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4090b81", new Object[]{this, new Integer(i)});
            return;
        }
        n nVar = this.node;
        if (nVar != null && ((String) nVar.H("onselectchange")) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("position", String.valueOf(i));
            sendMessage(this.node, "onselectchange", null, hashMap, null);
        }
    }

    /* renamed from: k */
    public b generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a0dba703", new Object[]{this});
        }
        return new b();
    }

    /* renamed from: l */
    public ProgressViewGroup onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProgressViewGroup) ipChange.ipc$dispatch("6e9f3daf", new Object[]{this, context});
        }
        return new ProgressViewGroup(context);
    }

    /* renamed from: i */
    public void applyAttrForView(ProgressViewGroup progressViewGroup, b bVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d98b413", new Object[]{this, progressViewGroup, bVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(progressViewGroup, bVar, map, z);
        if (progressViewGroup != null && bVar != null && bVar.w0 != null) {
            if (z || (map != null && map.size() > 0)) {
                IndicatorModel indicatorModel = bVar.w0;
                int i = indicatorModel.count;
                progressViewGroup.setInterval((long) (indicatorModel.interval * 1000.0d));
                progressViewGroup.setOnItemClickListener(new a(bVar, progressViewGroup));
                progressViewGroup.buildChildren(i);
                if (bVar.z0) {
                    progressViewGroup.selectIndex(bVar.y0, true);
                } else if (bVar.x0) {
                    progressViewGroup.startProgress(bVar.y0);
                } else if (map == null || !map.containsKey("selectindex")) {
                    progressViewGroup.pauseProgress();
                } else {
                    progressViewGroup.selectIndex(bVar.y0, false);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public IndicatorModel w0;
        public boolean x0;
        public int y0;
        public boolean z0;

        static {
            t2o.a(468714424);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -407167169) {
                super.v((Context) objArr[0], (String) objArr[1], objArr[2]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/hostcontainer/tnode/component/FullPageAlbumSliderComponent$SliderViewParams");
        }

        @Override // tb.jfw
        public void v(Context context, String str, Object obj) {
            char c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7bb1f3f", new Object[]{this, context, str, obj});
                return;
            }
            super.v(context, str, obj);
            try {
                switch (str.hashCode()) {
                    case -1162090388:
                        if (str.equals("testsence")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 224506198:
                        if (str.equals("selectindex")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 268913850:
                        if (str.equals("initdata")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1439562083:
                        if (str.equals("autoplay")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1985535473:
                        if (str.equals("setfull")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0) {
                    if (c == 1) {
                        this.x0 = nwv.o(obj, false);
                    } else if (c == 2) {
                        this.z0 = nwv.o(obj, false);
                    } else if (c != 3) {
                        if (c == 4) {
                            String str2 = (String) obj;
                        }
                    } else if (obj instanceof String) {
                        this.y0 = Integer.parseInt((String) obj);
                    }
                } else if (obj instanceof JSONObject) {
                    this.w0 = (IndicatorModel) JSON.parseObject(((JSONObject) obj).toJSONString(), IndicatorModel.class);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
