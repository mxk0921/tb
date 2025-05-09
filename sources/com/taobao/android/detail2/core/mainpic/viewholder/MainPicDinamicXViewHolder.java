package com.taobao.android.detail2.core.mainpic.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.mainpic.MainPicContainer;
import com.taobao.android.detail2.core.mainpic.a;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.hsm;
import tb.nd2;
import tb.pb6;
import tb.q0i;
import tb.q0j;
import tb.ro7;
import tb.s0m;
import tb.s8d;
import tb.so7;
import tb.t2o;
import tb.txj;
import tb.u0i;
import tb.yf2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MainPicDinamicXViewHolder extends MainPicAbsViewHolder<so7> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String h = "dx";
    public static final com.taobao.android.detail2.core.mainpic.viewholder.a i = new a();
    public ImageView f;
    public int g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements com.taobao.android.detail2.core.mainpic.viewholder.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail2.core.mainpic.viewholder.a
        public MainPicAbsViewHolder a(ViewGroup viewGroup, MainPicContainer mainPicContainer, a.b bVar, MainPicAbsViewHolder.a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MainPicAbsViewHolder) ipChange.ipc$dispatch("eff71e60", new Object[]{this, viewGroup, mainPicContainer, bVar, aVar, new Integer(i)});
            }
            ro7 h = bVar.h();
            DXTemplateItem d = h.d(i);
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (d == null) {
                return new MainPicDinamicXViewHolder(frameLayout, mainPicContainer, bVar, aVar);
            }
            DXResult<DXRootView> a2 = h.a(viewGroup.getContext(), d);
            if (a2.f7291a == null) {
                return new MainPicDinamicXViewHolder(frameLayout, mainPicContainer, bVar, aVar);
            }
            frameLayout.addView(a2.f7291a, new FrameLayout.LayoutParams(-1, -1));
            HashMap<String, String> k = bVar.k();
            if (k != null) {
                a2.f7291a.setTag(-1607140204, k.get("mountBizType"));
                a2.f7291a.setTag(1188984821, k.get("mountUniqId"));
            }
            a2.f7291a.setTag(1882865001, bVar.getNewDetailContext().h());
            MainPicDinamicXViewHolder mainPicDinamicXViewHolder = new MainPicDinamicXViewHolder(frameLayout, mainPicContainer, bVar, aVar);
            MainPicDinamicXViewHolder.z0(mainPicDinamicXViewHolder, View.generateViewId());
            a2.f7291a.setId(MainPicDinamicXViewHolder.y0(mainPicDinamicXViewHolder));
            a2.f7291a.setTag(1889390116, mainPicDinamicXViewHolder.e);
            return mainPicDinamicXViewHolder;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ImageView f7220a;
        public final a.b b;
        public final u0i c;

        static {
            t2o.a(352322170);
            t2o.a(620757101);
        }

        public b(a.b bVar, ImageView imageView, u0i u0iVar) {
            this.f7220a = imageView;
            this.b = bVar;
            this.c = u0iVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent == null) {
                return false;
            }
            this.f7220a.setImageDrawable(succPhenixEvent.getDrawable());
            txj.e(txj.TAG_RENDER, this.c.c + "mainPicDXViewHolder 背景高斯模糊图片设置,parent: " + this.b.d().f31127a);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352322171);
            t2o.a(620757101);
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            if (failPhenixEvent == null) {
                return false;
            }
            txj.e(txj.TAG_MAIN_PIC, "DX背景高斯模糊图片加载失败, failCode" + failPhenixEvent.getResultCode() + ", url: " + failPhenixEvent.getUrl());
            return false;
        }
    }

    static {
        t2o.a(352322167);
    }

    public MainPicDinamicXViewHolder(ViewGroup viewGroup, MainPicContainer mainPicContainer, a.b bVar, MainPicAbsViewHolder.a aVar) {
        super(viewGroup, mainPicContainer, bVar, aVar);
        A0();
    }

    public static /* synthetic */ Object ipc$super(MainPicDinamicXViewHolder mainPicDinamicXViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/viewholder/MainPicDinamicXViewHolder");
    }

    public static /* synthetic */ int y0(MainPicDinamicXViewHolder mainPicDinamicXViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a533387f", new Object[]{mainPicDinamicXViewHolder})).intValue();
        }
        return mainPicDinamicXViewHolder.g;
    }

    public static /* synthetic */ int z0(MainPicDinamicXViewHolder mainPicDinamicXViewHolder, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("913308a8", new Object[]{mainPicDinamicXViewHolder, new Integer(i2)})).intValue();
        }
        mainPicDinamicXViewHolder.g = i2;
        return i2;
    }

    public final void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.f = new ImageView(this.itemView.getContext());
        this.f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f.setScaleType(ImageView.ScaleType.FIT_XY);
        View view = this.itemView;
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(this.f, 0);
        }
        this.f.setOnTouchListener(new com.taobao.android.detail2.core.mainpic.viewholder.b(this, this.f, this.itemView.getContext(), this.b));
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void i0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae0cbe96", new Object[]{this, str});
        } else {
            this.f7219a.e().N0(null);
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb331c7", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void l0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20012b03", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void m0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bab56e6", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void n0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c806ec99", new Object[]{this, jSONObject});
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7d6fb7", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3255bb04", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void q0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bf9c08", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void r0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10632c34", new Object[]{this, str});
        }
    }

    /* renamed from: B0 */
    public void j0(so7 so7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4306027", new Object[]{this, so7Var});
        } else if (so7Var != null) {
            String j = hsm.j(this.f.getContext(), so7Var.f);
            if (!TextUtils.isEmpty(j)) {
                s0m.B().T(j).bitmapProcessors(true, new yf2(this.f.getContext(), this.f7219a.getNewDetailContext().m().x(), 2)).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, hsm.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new b(this.f7219a, this.f, this.d)).failListener(new c()).fetch();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currentMainPicData", (Object) so7Var.b);
            jSONObject.put("data", (Object) this.f7219a.d().d);
            jSONObject.put("marginTop", (Object) Integer.valueOf(pb6.z(this.f.getContext(), this.f7219a.getNewDetailContext().h().getNewDetailContainerStatusBarHeight() + this.f.getContext().getResources().getDimension(R.dimen.new_detail_nav_bar_height))));
            jSONObject.put("height", (Object) Integer.valueOf(pb6.z(this.f.getContext(), this.f7219a.g().r())));
            jSONObject.put("marginBottom", (Object) Integer.valueOf(pb6.z(this.f.getContext(), q0i.d(this.f7219a.getNewDetailContext(), String.valueOf(this.c.n().g), this.f7219a.g().t()))));
            View view = this.itemView;
            if (view != null) {
                View findViewById = view.findViewById(this.g);
                if (findViewById instanceof DXRootView) {
                    DXResult<DXRootView> f = this.f7219a.h().f((DXRootView) findViewById, jSONObject);
                    if (f != null && f.d() && f.a() != null) {
                        q0j.m(q0j.SCENE_DX, q0j.ERROR_CODE_DX_TEMPLATE_RENDER_ERROR, "模板渲染失败: " + f.a(), this.f7219a.getNewDetailContext().j().T());
                        return;
                    }
                    return;
                }
                q0j.m(q0j.SCENE_DX, q0j.ERROR_CODE_DX_TEMPLATE_RENDER_ERROR, "模板渲染失败: 跟节点非dxview", this.f7219a.getNewDetailContext().j().T());
            }
        }
    }
}
