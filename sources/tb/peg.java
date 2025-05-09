package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognationPO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class peg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final peg f26043a;
    public final List<peg> b = new ArrayList();
    public final String c;
    public String d;
    public ydg e;
    public JSONObject f;
    public JSONObject g;

    static {
        t2o.a(295699216);
    }

    public peg(String str, peg pegVar) {
        this.c = str;
        this.f26043a = pegVar;
    }

    public DXTemplateItem a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("14ded4db", new Object[]{this});
        }
        if (!c()) {
            return null;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        ydg ydgVar = this.e;
        dXTemplateItem.f7343a = ydgVar.b;
        dXTemplateItem.b = ydgVar.c;
        return dXTemplateItem;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f669ff82", new Object[]{this})).booleanValue();
        }
        ydg ydgVar = this.e;
        if (ydgVar == null) {
            return false;
        }
        if (TextUtils.equals(ydgVar.b, ExperimentCognationPO.TYPE_LAYER) || TextUtils.equals(this.e.b, "linearlayout")) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7bf28c9", new Object[]{this})).booleanValue();
        }
        ydg ydgVar = this.e;
        if (ydgVar != null) {
            return TextUtils.equals(ydgVar.f32002a, "dinamicx");
        }
        return false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98b31904", new Object[]{this})).booleanValue();
        }
        ydg ydgVar = this.e;
        if (ydgVar != null) {
            return TextUtils.equals(ydgVar.b, "linearlayout");
        }
        return false;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7af7990d", new Object[]{this})).booleanValue();
        }
        return c();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "name=" + this.c + "   type=" + this.d;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96cb125a", new Object[]{this})).booleanValue();
        }
        ydg ydgVar = this.e;
        if (ydgVar != null) {
            return TextUtils.equals(ydgVar.b, "sub_section");
        }
        return false;
    }
}
