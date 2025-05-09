package com.etao.feimagesearch.capture.dynamic.musvh;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.b;
import com.taobao.taobao.R;
import tb.ckf;
import tb.cxc;
import tb.igw;
import tb.k7m;
import tb.npc;
import tb.p1p;
import tb.r7m;
import tb.t2o;
import tb.zwh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class PltMusCellViewHolder extends RecyclerView.ViewHolder implements npc, cxc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f4660a;
    public final boolean b;
    public a c;
    public final View d;
    public final ViewGroup e;
    public r7m g;
    public int f = -1;
    public boolean h = true;

    static {
        t2o.a(481296676);
        t2o.a(982515990);
        t2o.a(481296673);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PltMusCellViewHolder(Activity activity, ViewGroup viewGroup, boolean z) {
        super(LayoutInflater.from(activity).inflate(R.layout.libsf_search_item_muise, viewGroup, false));
        ckf.g(activity, "activity");
        ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        this.f4660a = activity;
        this.b = z;
        View findViewById = this.itemView.findViewById(R.id.placeholder_img);
        ckf.f(findViewById, "itemView.findViewById(R.id.placeholder_img)");
        this.d = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.dynamic_container);
        ckf.f(findViewById2, "itemView.findViewById(R.id.dynamic_container)");
        this.e = (ViewGroup) findViewById2;
        a b = b.f().b(activity);
        String h = ScreenType.h(c0());
        if (!TextUtils.isEmpty(h)) {
            b.addInstanceEnv(k7m.KEY_SCREEN_STYLE, h);
        }
        b.registerRenderListener(this);
        this.c = b;
    }

    public static /* synthetic */ Object ipc$super(PltMusCellViewHolder pltMusCellViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/musvh/PltMusCellViewHolder");
    }

    public final int c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3508c4ea", new Object[]{this})).intValue();
        }
        ScreenType g = ScreenType.g(this.f4660a);
        if (g == null) {
            return 0;
        }
        return g.c();
    }

    public final boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43e3c807", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82d49e5", new Object[]{this});
            return;
        }
        a aVar = this.c;
        if (aVar != null) {
            aVar.sendInstanceMessage("appear", null);
        }
    }

    public final void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        a aVar = this.c;
        if (aVar != null) {
            aVar.sendInstanceMessage("disappear", null);
        }
    }

    @Override // tb.cxc
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        a aVar = this.c;
        if (aVar != null) {
            aVar.destroy();
        }
        this.c = null;
    }

    @Override // tb.cxc
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c591371", new Object[]{this});
        }
    }

    @Override // tb.cxc
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b94d49d", new Object[]{this});
            return;
        }
        a aVar = this.c;
        if (aVar != null) {
            aVar.onActivityPause();
        }
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.onActivityStop();
        }
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // tb.npc
    public void onJSException(a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
        }
    }

    @Override // tb.npc
    public void onPrepareSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRefreshFailed(a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.e.setVisibility(8);
        this.d.setVisibility(8);
    }

    @Override // tb.npc
    public void onRefreshSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRenderFailed(a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.e.setVisibility(8);
        this.d.setVisibility(8);
    }

    @Override // tb.npc
    public void onRenderSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        this.h = true;
        if (aVar != null) {
            int rootHeight = aVar.getRootHeight();
            if (rootHeight > 0) {
                ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                layoutParams.height = rootHeight;
                this.itemView.setLayoutParams(layoutParams);
            }
            View renderRoot = aVar.getRenderRoot();
            igw.a(renderRoot);
            this.e.addView(renderRoot, new ViewGroup.LayoutParams(-1, -2));
            this.e.setVisibility(0);
            this.d.setVisibility(8);
        }
    }

    @Override // tb.cxc
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        a aVar = this.c;
        if (aVar != null) {
            aVar.onActivityStart();
        }
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.onActivityResume();
        }
    }

    public final void b0(int i, r7m r7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5205465", new Object[]{this, new Integer(i), r7mVar});
        } else if (r7mVar != null) {
            if (this.f != i || !ckf.b(this.g, r7mVar)) {
                String str = null;
                if (this.g == null) {
                    this.f = i;
                    this.g = r7mVar;
                    ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                    layoutParams.height = p1p.a(50.0f);
                    this.itemView.setLayoutParams(layoutParams);
                    if (this.h) {
                        this.h = false;
                        this.d.setVisibility(0);
                        this.e.setVisibility(8);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put((JSONObject) "model", (String) r7mVar.a());
                        jSONObject.put((JSONObject) "status", (String) r7mVar.b());
                        jSONObject.put((JSONObject) "triggerElder", String.valueOf(d0()));
                        zwh.a aVar = zwh.Companion;
                        a aVar2 = this.c;
                        TemplateBean c = r7mVar.c();
                        if (c != null) {
                            str = c.url;
                        }
                        aVar.a(aVar2, str, "https://h5.m.taobao.com/tusou/index.html", jSONObject, null);
                        return;
                    }
                    return;
                }
                this.f = i;
                this.g = r7mVar;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "model", (String) r7mVar.a());
                jSONObject2.put((JSONObject) "status", (String) r7mVar.b());
                a aVar3 = this.c;
                if (aVar3 != null) {
                    aVar3.refresh(jSONObject2, null);
                }
            }
        }
    }
}
