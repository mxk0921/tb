package tb;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class z86 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ROVERLAY = 6136827152325085276L;
    public static final String TAG = "rOverlay";

    /* renamed from: a  reason: collision with root package name */
    public String f32600a;
    public final dan b = ban.b;
    public qhj c = ban.c;

    static {
        t2o.a(729809025);
    }

    public static /* synthetic */ Object ipc$super(z86 z86Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/eventhandler/DXROverlayEvent");
    }

    public final View a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("12f06cf0", new Object[]{this, view});
        }
        while (view != null && !(view.getParent() instanceof RecyclerView)) {
            view = (View) view.getParent();
        }
        return view;
    }

    public final void b(SectionModel sectionModel, View view, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, String str, DinamicXEngine dinamicXEngine, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286e6b38", new Object[]{this, sectionModel, view, onClickListener, onClickListener2, str, dinamicXEngine, str2});
            return;
        }
        String str3 = this.f32600a;
        if (str3 != null && !TextUtils.equals(str3, str)) {
            this.c.a();
            this.c = new qhj();
            this.f32600a = str;
        } else if (this.f32600a == null) {
            this.f32600a = str;
        }
        this.c.c(dinamicXEngine, str2);
        if (sectionModel.getJSONObject("subSection") == null || sectionModel.getJSONObject("subSection").getJSONObject("overlay") == null || sectionModel.getJSONObject("subSection").getJSONObject("overlay").getJSONObject("item") == null) {
            bqa.d("rOverlay", "homeRecmdProcess overlay default");
            this.c.d(view.getContext(), a(view), null, null, sectionModel);
        } else {
            JSONObject jSONObject = sectionModel.getJSONObject("subSection").getJSONObject("overlay").getJSONObject("item");
            JSONObject jSONObject2 = sectionModel.getJSONObject("subSection").getJSONObject("overlay");
            if (jSONObject.getJSONObject("0") != null) {
                bqa.d("rOverlay", "homeRecmdProcess overlay hasDelete");
                onClickListener = new z9n(this.c, sectionModel, jSONObject2);
            }
            if (jSONObject.getJSONObject(r4p.VALUE_SHOWTYPE_SIMILAR) != null) {
                bqa.d("rOverlay", "homeRecmdProcess overlay hasSimilar");
                onClickListener2 = new ohj(this.c, sectionModel, jSONObject2);
            }
            this.c.d(view.getContext(), a(view), onClickListener, onClickListener2, sectionModel);
        }
        gqv.d(sectionModel);
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        try {
            sfh.f("DXROverlayEvent", "handleEvent");
            SectionModel sectionModel = new SectionModel(dXRuntimeContext.i());
            DXRootView L = dXRuntimeContext.L();
            if (!sectionModel.isEmpty() && L != null) {
                c(L, sectionModel, objArr, dXRuntimeContext.r());
                bqa.d("DXROverlayEvent", "old overlay chain has passed");
            }
        } catch (Throwable th) {
            bqa.b("DXROverlayEvent", "rOverlayError", th);
        }
    }

    public final void c(View view, SectionModel sectionModel, Object[] objArr, DinamicXEngine dinamicXEngine) {
        v9n v9nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326d5946", new Object[]{this, view, sectionModel, objArr, dinamicXEngine});
            return;
        }
        View a2 = a(view);
        if (a2.getTag(R.id.tag_recommend_datasource) == null) {
            Object tag = a2.getTag(R.id.tag_recommend_containerId);
            String obj = tag == null ? null : tag.toString();
            String substring = !TextUtils.isEmpty(obj) ? obj.substring(obj.lastIndexOf(95) + 1) : null;
            if (!TextUtils.isEmpty(substring)) {
                b(sectionModel, view, null, null, substring, dinamicXEngine, obj);
            }
        } else if (objArr != null && objArr.length >= 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj2;
                if (jSONObject.getJSONObject("content") != null) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                    boolean isEmpty = TextUtils.isEmpty(jSONObject2.getString("deleteId"));
                    boolean z = true ^ isEmpty;
                    if (!isEmpty) {
                        dan danVar = this.b;
                        v9nVar = new v9n(danVar, sectionModel, jSONObject);
                        danVar.c();
                    } else {
                        v9nVar = null;
                    }
                    this.b.b(z);
                    this.b.d(view.getContext(), a(view), v9nVar, !TextUtils.isEmpty(jSONObject2.getString("similarUrl")) ? new r9n(this.b, jSONObject) : null, sectionModel);
                }
            }
        }
    }
}
