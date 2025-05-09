package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wo8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final cfc c;
    public boolean d = false;

    /* renamed from: a  reason: collision with root package name */
    public final a f30818a = new a();
    public final b<String> b = new b<>(100);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f30819a = false;
        public final boolean b = mve.a("localOrangeExpoFilterEnable", true);

        static {
            t2o.a(491782331);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c9ddc482", new Object[]{this})).booleanValue();
            }
            if (!this.b || !this.f30819a) {
                return false;
            }
            return true;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a68704c1", new Object[]{this})).booleanValue();
            }
            return this.f30819a;
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8c5db4c7", new Object[]{this})).booleanValue();
            }
            return this.b;
        }

        public void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3070af7f", new Object[]{this, new Boolean(z)});
            } else {
                this.f30819a = z;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b<E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f30820a;
        public final Object c = new Object();
        public final LinkedList<E> b = new LinkedList<>();

        static {
            t2o.a(491782332);
        }

        public b(int i) {
            this.f30820a = i;
        }

        public static /* synthetic */ void a(b bVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("586964f6", new Object[]{bVar, obj});
            } else {
                bVar.b(obj);
            }
        }

        public final void b(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba2da84", new Object[]{this, e});
                return;
            }
            synchronized (this.c) {
                try {
                    if (this.b.size() >= this.f30820a) {
                        this.b.poll();
                    }
                    this.b.offer(e);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            synchronized (this.c) {
                this.b.clear();
            }
        }

        public boolean d(E e) {
            boolean contains;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, e})).booleanValue();
            }
            synchronized (this.c) {
                contains = this.b.contains(e);
            }
            return contains;
        }

        public int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("85622849", new Object[]{this})).intValue();
            }
            return this.f30820a;
        }

        public void f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d2c5079", new Object[]{this, new Integer(i)});
            } else {
                this.f30820a = i;
            }
        }
    }

    static {
        t2o.a(491782330);
    }

    public wo8(cfc cfcVar) {
        this.c = cfcVar;
    }

    public void a(BaseSectionModel baseSectionModel) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f0aec7", new Object[]{this, baseSectionModel});
        } else if (baseSectionModel != null) {
            JSONObject ext = baseSectionModel.getExt();
            if (ext != null) {
                str = ext.getString("cardFeatureId");
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                fve.e("ExpoFilterManger", "cardFeatureId is empty");
            } else if (!this.b.d(str)) {
                b.a(this.b, str);
            } else {
                fve.e("ExpoFilterManger", "addExposeItem, SectionBizCode:" + baseSectionModel.getSectionBizCode());
            }
        }
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c24c45e", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cardFeature", (Object) str);
        fve.e("ExpoFilterManger", "ExposedFilter success, " + jSONObject.toJSONString());
        uve.a(this.c.getContainerType().a(), 19999, "expoFilterRemoveSameItem", null, null, jSONObject.toJSONString());
    }

    public void c(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d22449", new Object[]{this, iContainerDataModel});
        } else if (!this.f30818a.a()) {
            fve.e("ExpoFilterManger", "expo redundant item filter unEnable,server:" + this.f30818a.b() + ",local:" + this.f30818a.c());
        } else {
            try {
                boolean d = d(iContainerDataModel);
                List<?> sections = iContainerDataModel.getBase().getSections();
                ArrayList arrayList = new ArrayList(8);
                Iterator<?> it = sections.iterator();
                while (it.hasNext()) {
                    SectionModel sectionModel = (SectionModel) it.next();
                    String string = sectionModel.getExt().getString("cardFeatureId");
                    if (TextUtils.isEmpty(string)) {
                        fve.e("ExpoFilterManger", "cardFeatureId is empty");
                    } else if (this.b.d(string)) {
                        arrayList.add(sectionModel);
                        b(string);
                    } else if (d) {
                        b.a(this.b, string);
                    }
                }
                sections.removeAll(arrayList);
            } catch (Exception e) {
                fve.e("ExpoFilterManger", "filter items failed" + Log.getStackTraceString(e));
            }
        }
    }

    public final boolean d(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c24eee0", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null || iContainerDataModel.getBase() == null || iContainerDataModel.getBase().getPageParams() == null || iContainerDataModel.getBase().getPageParams().getPageNum() != 0) {
            return false;
        }
        return true;
    }

    public void f(IContainerDataModel<?> iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("332d5f4b", new Object[]{this, iContainerDataModel, str});
        } else if (iContainerDataModel != null) {
            if (e(iContainerDataModel) || d(iContainerDataModel)) {
                this.b.c();
            }
            if (c6o.a(iContainerDataModel)) {
                h(iContainerDataModel);
                c(iContainerDataModel);
            }
        }
    }

    public void g(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f068bc5a", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel != null && !this.d) {
            this.d = true;
            if (h93.b((IMainFeedsViewService) this.c.a(IMainFeedsViewService.class))) {
                h(iContainerDataModel);
                c(iContainerDataModel);
            }
        }
    }

    public final void h(IContainerDataModel<?> iContainerDataModel) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca81bf3", new Object[]{this, iContainerDataModel});
            return;
        }
        try {
            if (zza.c() == null) {
                fve.e("ExpoFilterManger", "HomeGateway.getRecmdDataSource() == null");
                return;
            }
            JSONObject A = zza.c().A();
            if (A == null) {
                fve.e("ExpoFilterManger", "ext == null");
                uve.a("Page_Home", 19999, "expoFilterError", "ext is null", null, null);
                return;
            }
            if (A.containsKey("exposureFilterOptimization")) {
                this.f30818a.d(A.getBooleanValue("exposureFilterOptimization"));
            } else {
                uve.a("Page_Home", 19999, "expoFilterError", "ext not contains exposureFilterOptimization", null, null);
                fve.e("ExpoFilterManger", "ext not contains exposureFilterOptimization");
            }
            if (A.containsKey("exposureFilterBufferSize") && this.b.e() != (intValue = A.getInteger("exposureFilterBufferSize").intValue())) {
                this.b.f(intValue);
            }
        } catch (Exception e) {
            uve.a("Page_Home", 19999, "expoFilterError", "parser config failed" + Log.getStackTraceString(e), null, null);
            fve.e("ExpoFilterManger", "parser config failed" + Log.getStackTraceString(e));
        }
    }

    public final boolean e(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd1543a", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null) {
            fve.e("ExpoFilterManger", "containerData == null");
            return false;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            fve.e("ExpoFilterManger", "baseData == null");
            return false;
        }
        JSONObject ext = base.getExt();
        if (ext != null) {
            return TextUtils.equals("true", ext.getString("clearExposureFilterBuffer"));
        }
        fve.e("ExpoFilterManger", "ext == null");
        return false;
    }
}
