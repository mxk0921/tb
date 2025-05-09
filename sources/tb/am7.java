package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import com.taobao.live.home.dinamic.model.TemplateObject;
import com.taobao.live.home.dinamic.widget.DXTBLNativeTextView;
import com.taobao.taolive.uikit.view.TBLCommentView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class am7 extends l00 implements cvd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DinamicDataObject c;
    public TemplateObject d;
    public final Context e;
    public final ViewGroup f;
    public View g;
    public boolean h;
    public eqd i;
    public boolean j = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements rzb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.rzb
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd6216d0", new Object[]{this, view});
            } else {
                am7.this.c(view);
            }
        }

        @Override // tb.rzb
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a14aabed", new Object[]{this});
            } else {
                am7.this.b();
            }
        }
    }

    static {
        t2o.a(806355413);
        t2o.a(806356532);
    }

    public am7(DinamicDataObject dinamicDataObject, Context context, ViewGroup viewGroup) {
        if (dinamicDataObject != null) {
            r(dinamicDataObject);
        }
        this.e = context;
        this.f = viewGroup;
    }

    public static ArrayList<cpb> i(View view) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f7c7219c", new Object[]{view});
        }
        ArrayList<cpb> arrayList = new ArrayList<>();
        if (view != null) {
            if (view instanceof cpb) {
                arrayList.add((cpb) view);
            }
            if (view instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    ArrayList<cpb> i2 = i(viewGroup.getChildAt(i));
                    if (!i2.isEmpty()) {
                        arrayList.addAll(i2);
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ Object ipc$super(am7 am7Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.a();
                return null;
            case -583924053:
                super.c((View) objArr[0]);
                return null;
            case -558272972:
                super.e();
                return null;
            case 498594312:
                super.b();
                return null;
            case 828227453:
                super.d();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/card/DinamicCard");
        }
    }

    @Override // tb.l00
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.a();
        this.i = null;
    }

    @Override // tb.l00
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db7f208", new Object[]{this});
        } else {
            super.b();
        }
    }

    @Override // tb.l00
    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3206ab", new Object[]{this, view});
            return;
        }
        if (view != null) {
            this.g = view;
            f(i(view));
        }
        super.c(view);
    }

    @Override // tb.l00
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            super.d();
        }
    }

    @Override // tb.l00
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        super.e();
        DinamicDataObject dinamicDataObject = this.c;
        if (dinamicDataObject != null && !arq.a(dinamicDataObject.type) && this.c.type.equals("big_card")) {
            this.c.playOnce = false;
        }
        l(false);
    }

    public void h() {
        HashMap<String, JSONObject> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54838a8e", new Object[]{this});
        } else if (this.g != null && this.c != null) {
            try {
                if (LiveHomeController.instance().getDinamicSdkManager() != null) {
                    DinamicXEngine dinamicEngine = LiveHomeController.instance().getDinamicSdkManager().getDinamicEngine();
                    if (!(dinamicEngine == null || (hashMap = this.c.data) == null)) {
                        View view = this.g;
                        if (view instanceof DXRootView) {
                            dinamicEngine.D0(this.e, hashMap.get("data"), ((DXRootView) view).getDxTemplateItem(), -1);
                        }
                    }
                    LiveHomeController.instance().getDinamicSdkManager().bindData(this.g, this.c);
                }
            } catch (Exception e) {
                r0h.c("CardContainer", "bind data exp", e);
                r0h.b("CardContainer", "    template name: " + this.c.templateName);
            }
        }
    }

    public DinamicDataObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicDataObject) ipChange.ipc$dispatch("26a54eaa", new Object[]{this});
        }
        return this.c;
    }

    public TemplateObject k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateObject) ipChange.ipc$dispatch("22afe2a9", new Object[]{this});
        }
        return this.d;
    }

    public void l(boolean z) {
        ViewGroup viewGroup;
        float f;
        eqd eqdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4159b66d", new Object[]{this, new Boolean(z)});
        } else if ((!this.h || z) && (viewGroup = this.f) != null && this.g != null) {
            int height = viewGroup.getHeight();
            Rect rect = new Rect();
            this.g.getGlobalVisibleRect(rect);
            if (height > 0) {
                f = (rect.height() * 1.0f) / height;
            } else {
                f = 0.0f;
            }
            if (f >= e2h.q() && (eqdVar = this.i) != null) {
                this.h = eqdVar.W1(this.c);
            }
        }
    }

    public void m() {
        ArrayList<cpb> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d3d689", new Object[]{this});
        } else if (this.f != null && this.g != null && (arrayList = this.b) != null && arrayList.size() > 0) {
            Iterator<cpb> it = this.b.iterator();
            while (it.hasNext()) {
                cpb next = it.next();
                if (next instanceof TBLCommentView) {
                    ((TBLCommentView) next).setVisibility(8);
                }
            }
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156fa3d3", new Object[]{this});
        } else if (this.c != null && this.e != null) {
            try {
                if (LiveHomeController.instance().getDinamicSdkManager() != null) {
                    LiveHomeController.instance().getDinamicSdkManager().inflateView(this.e, this.c, new a());
                }
            } catch (Exception e) {
                r0h.c("CardContainer", "inflate view exp.", e);
                r0h.b("CardContainer", "    template name: " + this.c.templateName);
            }
        }
    }

    public void o() {
        DinamicDataObject dinamicDataObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b21af0", new Object[]{this});
            return;
        }
        eqd eqdVar = this.i;
        if (eqdVar != null && (dinamicDataObject = this.c) != null) {
            eqdVar.e0(this, dinamicDataObject);
        }
    }

    @Override // tb.cvd
    public void onVideoRequestAccept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49416702", new Object[]{this});
        }
    }

    @Override // tb.cvd
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        DinamicDataObject dinamicDataObject = this.c;
        if (dinamicDataObject != null && !dinamicDataObject.noNeedSetPlayOnce) {
            dinamicDataObject.playOnce = true;
        }
        v();
    }

    @Override // tb.cvd
    public void onVideoStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894a6d85", new Object[]{this});
            return;
        }
        m();
        qyg.c().d("com.taobao.live.home.video.auto.play.stop");
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
        } else if (LiveHomeController.instance().getDinamicSdkManager() != null && !this.j) {
            this.j = true;
            LiveHomeController.instance().getDinamicSdkManager().setWillDisplay(this.g);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
        } else if (LiveHomeController.instance().getDinamicSdkManager() != null && this.j) {
            this.j = false;
            LiveHomeController.instance().getDinamicSdkManager().setDidEndDisplay(this.g);
        }
    }

    public void s() {
        ArrayList<cpb> arrayList;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("319962e", new Object[]{this});
        } else if (e2h.k() && this.f != null && this.g != null && (arrayList = this.b) != null && arrayList.size() > 0 && this.c != null) {
            Rect rect = new Rect();
            boolean localVisibleRect = this.g.getLocalVisibleRect(rect);
            if (rect.height() == this.g.getMeasuredHeight()) {
                z = true;
            }
            Iterator<cpb> it = this.b.iterator();
            while (it.hasNext()) {
                cpb next = it.next();
                if (next instanceof DXTBLNativeTextView) {
                    DXTBLNativeTextView dXTBLNativeTextView = (DXTBLNativeTextView) next;
                    if (!localVisibleRect || !z) {
                        if (dXTBLNativeTextView.isSelected()) {
                            dXTBLNativeTextView.cancelLongTextMarquee();
                        }
                    } else if (!dXTBLNativeTextView.isSelected()) {
                        dXTBLNativeTextView.startLongTextMarquee();
                    }
                }
            }
        }
    }

    public void t(eqd eqdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767a8d62", new Object[]{this, eqdVar});
        } else {
            this.i = eqdVar;
        }
    }

    public void u(TemplateObject templateObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888bee1f", new Object[]{this, templateObject});
        } else {
            this.d = templateObject;
        }
    }

    public void v() {
        ArrayList<cpb> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b224b6e", new Object[]{this});
        } else if (this.f != null && this.g != null && (arrayList = this.b) != null && arrayList.size() > 0) {
            Iterator<cpb> it = this.b.iterator();
            while (it.hasNext()) {
                cpb next = it.next();
                if (next instanceof TBLCommentView) {
                    ((TBLCommentView) next).setVisibility(0);
                }
            }
        }
    }

    public void w() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c2756a9", new Object[]{this});
        } else if (e2h.n() && this.i != null && this.g != null && this.c != null) {
            Rect rect = new Rect();
            boolean localVisibleRect = this.g.getLocalVisibleRect(rect);
            if (rect.height() > this.g.getMeasuredHeight() / 2) {
                z = true;
            }
            DinamicDataObject dinamicDataObject = this.c;
            if (!dinamicDataObject.mShowUtParam && localVisibleRect && z) {
                this.i.e0(this, dinamicDataObject);
                this.c.mShowUtParam = true;
            }
        }
    }

    public void r(DinamicDataObject dinamicDataObject) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70543ba", new Object[]{this, dinamicDataObject});
            return;
        }
        this.c = dinamicDataObject;
        if (dinamicDataObject != null) {
            try {
                HashMap<String, JSONObject> hashMap = dinamicDataObject.data;
                if (hashMap != null && (jSONObject = hashMap.get("data")) != null && (jSONArray = jSONObject.getJSONArray("cardData")) != null && jSONArray.size() > 0 && (jSONObject2 = jSONArray.getJSONObject(0)) != null && (jSONObject3 = jSONObject2.getJSONObject("liveInfo")) != null && (jSONObject4 = jSONObject3.getJSONObject("queryParams")) != null) {
                    jSONObject4.getString("feedId");
                }
            } catch (Exception e) {
                r0h.c("CardContainer", "setDinamicDataObject exp.", e);
            }
        }
    }
}
