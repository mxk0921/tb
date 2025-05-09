package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ct1;
import tb.imb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class f4p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String POP_SEARCH_HEADER_TAG = "popSearchHeader";
    public static final String c = Localization.q(R.string.taobao_app_1028_1_21659);

    /* renamed from: a  reason: collision with root package name */
    public final kmb f19006a;
    public final Context b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements imb.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ imb f19007a;

        public a(imb imbVar) {
            this.f19007a = imbVar;
        }

        @Override // tb.imb.b
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
            } else {
                this.f19007a.g(this);
            }
        }

        @Override // tb.imb.b
        public void onShow() {
            IDMComponent iDMComponent;
            JSONObject fields;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
                return;
            }
            List<IDMComponent> k0 = f4p.a(f4p.this).e().k0();
            if (k0 != null) {
                Iterator<IDMComponent> it = k0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        iDMComponent = null;
                        break;
                    }
                    iDMComponent = it.next();
                    if (f4p.POP_SEARCH_HEADER_TAG.equals(iDMComponent.getTag())) {
                        break;
                    }
                }
                if (iDMComponent != null && (fields = iDMComponent.getFields()) != null) {
                    fields.put(Constants.Event.FOCUS, (Object) Boolean.TRUE);
                    fields.put("keyword", (Object) "");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/manager/SearchManager$2");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            f4p.a(f4p.this).Q().c(null);
            f4p.a(f4p.this).e().F0(false);
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            } else {
                f4p.a(f4p.this).e().F0(false);
            }
        }
    }

    static {
        t2o.a(479199482);
    }

    public f4p(kmb kmbVar) {
        this.f19006a = kmbVar;
        kmbVar.Y();
        this.b = kmbVar.getContext();
    }

    public static /* synthetic */ kmb a(f4p f4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("3404b7b5", new Object[]{f4pVar});
        }
        return f4pVar.f19006a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d1b4be7", new Object[]{this});
        } else {
            h();
        }
    }

    public final EditText c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("bb88dd9b", new Object[]{this, view});
        }
        return (EditText) view.findViewWithTag("editText");
    }

    public final EditText d(lcu lcuVar) {
        DXWidgetNode expandWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("5b0bd4f8", new Object[]{this, lcuVar});
        }
        Object e = lcuVar.e("triggerView");
        if (!(e instanceof DXRootView) || (expandWidgetNode = ((DXRootView) e).getExpandWidgetNode()) == null) {
            return null;
        }
        DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId("input");
        if (queryWidgetNodeByUserId.getDXRuntimeContext() == null) {
            return null;
        }
        return c(queryWidgetNodeByUserId.getDXRuntimeContext().D());
    }

    public void e(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3430b5", new Object[]{this, lcuVar});
            return;
        }
        IDMComponent a2 = lcuVar.a();
        EditText d = d(lcuVar);
        if (a2 != null && d != null && d.getText() != null) {
            String obj = d.getText().toString();
            if (a2.getFields() != null) {
                a2.getFields().put("keyword", (Object) obj);
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71697536", new Object[]{this});
            return;
        }
        imb h0 = this.f19006a.e().h0();
        if (h0 != null) {
            h0.h(new a(h0));
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f3d4c27", new Object[]{this});
            return;
        }
        List<ct1.b> b2 = this.f19006a.d().b();
        if (b2 != null) {
            ListIterator<ct1.b> listIterator = b2.listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.next() == null) {
                    listIterator.remove();
                }
            }
        }
    }

    public void g(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3102e4", new Object[]{this, lcuVar});
            return;
        }
        IDMComponent a2 = lcuVar.a();
        if (a2 != null) {
            EditText d = d(lcuVar);
            if (d == null || d.getText() == null || TextUtils.isEmpty(d.getText().toString()) || TextUtils.isEmpty(d.getText().toString().trim())) {
                be3.c(this.b, c);
                return;
            }
            d.clearFocus();
            String trim = d.getText().toString().trim();
            JSONObject fields = a2.getFields();
            if (fields != null) {
                fields.put(Constants.Event.FOCUS, (Object) Boolean.FALSE);
                fields.put("keyword", (Object) trim);
            }
            zxb P = this.f19006a.d();
            P.V("search_" + trim);
            HashMap hashMap = new HashMap();
            hashMap.put(RequestConfig.IS_POP_LAYE_RQUERY, "true");
            hashMap.put(RequestConfig.IS_POP_LAYER_FIRST_PAGE, "true");
            this.f19006a.e().F0(true);
            this.f19006a.f0(false, hashMap, new b());
        }
    }
}
