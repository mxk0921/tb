package com.taobao.android.a11y.ability.ocr;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.a11y.ability.common.mtop.A11yMtopClient;
import com.taobao.android.a11y.ability.ocr.OCRBatchManager;
import com.taobao.android.a11y.ability.ocr.OCRResponseData;
import com.taobao.android.a11y.ability.ocr.OCRResultData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ewu;
import tb.kuv;
import tb.mh4;
import tb.nbk;
import tb.rov;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, WeakReference<View>> e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public boolean f6251a;
    public String b = "图片识别中";
    public String c = "图片识别失败";
    public String d;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.a11y.ability.ocr.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class C0326a extends tb.b<OCRResponseData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f6252a;

        public C0326a(List list) {
            this.f6252a = list;
        }

        public static /* synthetic */ Object ipc$super(C0326a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/a11y/ability/ocr/A11yOCRManager$1");
        }

        @Override // tb.b
        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e8a5269", new Object[]{this, mtopResponse});
                return;
            }
            a aVar = a.this;
            a.g(aVar, this.f6252a, a.c(aVar));
        }

        /* renamed from: c */
        public void b(OCRResponseData oCRResponseData) {
            OCRResultData oCRResultData;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e753c427", new Object[]{this, oCRResponseData});
            } else if (a.f(a.this, oCRResponseData)) {
                a aVar = a.this;
                a.g(aVar, this.f6252a, a.c(aVar));
            } else {
                OCRResponseData.GrayInfo grayInfo = oCRResponseData.grayInfo;
                if (grayInfo != null) {
                    a.h(a.this, grayInfo.tableRecoGray);
                }
                for (Map.Entry<String, OCRResponseData.OCRResponseItemData> entry : oCRResponseData.data.entrySet()) {
                    String key = entry.getKey();
                    OCRResponseData.OCRResponseItemData value = entry.getValue();
                    View i = a.i(a.this, key);
                    if (i != null) {
                        if (value == null) {
                            a.j(a.this, i, new OCRResultData(a.c(a.this), OCRResultData.ResultType.FAIL));
                        } else {
                            if (!TextUtils.isEmpty(value.content)) {
                                oCRResultData = new OCRResultData(value.content, OCRResultData.ResultType.SUCCESS);
                                oCRResultData.d(value.tableReco);
                            } else {
                                oCRResultData = new OCRResultData(a.c(a.this), OCRResultData.ResultType.FAIL);
                            }
                            a.j(a.this, i, oCRResultData);
                            nbk.c().a(key, oCRResultData);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends View.AccessibilityDelegate {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(a aVar) {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1548734636) {
                super.onPopulateAccessibilityEvent((View) objArr[0], (AccessibilityEvent) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/a11y/ability/ocr/A11yOCRManager$2");
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3b02f54", new Object[]{this, view, accessibilityEvent});
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends View.AccessibilityDelegate {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6253a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View.AccessibilityDelegate c;

        public c(String str, View view, View.AccessibilityDelegate accessibilityDelegate) {
            this.f6253a = str;
            this.b = view;
            this.c = accessibilityDelegate;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1877873384) {
                super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfo) objArr[1]);
                return null;
            } else if (hashCode == -1548734636) {
                super.onPopulateAccessibilityEvent((View) objArr[0], (AccessibilityEvent) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/a11y/ability/ocr/A11yOCRManager$3");
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9011ed18", new Object[]{this, view, accessibilityNodeInfo});
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            View.AccessibilityDelegate accessibilityDelegate = this.c;
            if (accessibilityDelegate != null) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3b02f54", new Object[]{this, view, accessibilityEvent});
                return;
            }
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            kuv.d(new tb.a(this.b, accessibilityEvent, a.k(a.this, view, this.f6253a)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$a11y$ability$ocr$OCRResultData$ResultType;

        static {
            int[] iArr = new int[OCRResultData.ResultType.values().length];
            $SwitchMap$com$taobao$android$a11y$ability$ocr$OCRResultData$ResultType = iArr;
            try {
                iArr[OCRResultData.ResultType.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$a11y$ability$ocr$OCRResultData$ResultType[OCRResultData.ResultType.HOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$a11y$ability$ocr$OCRResultData$ResultType[OCRResultData.ResultType.FAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f6254a;
        public String b;
        public String c;
        public boolean d = true;

        static {
            t2o.a(335544339);
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("79fb864f", new Object[]{this});
            }
            a aVar = new a();
            aVar.x(this.f6254a);
            a.b(aVar, this.b);
            a.d(aVar, this.c);
            a.e(aVar, this.d);
            return aVar;
        }

        public e b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("c374ad5c", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public e c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("3037fd9a", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public e d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("a636a464", new Object[]{this, new Boolean(z)});
            }
            this.f6254a = z;
            return this;
        }

        public e e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("9976555f", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f implements OCRBatchManager.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<a> f6255a;

        static {
            t2o.a(335544340);
            t2o.a(335544343);
        }

        public f(a aVar) {
            this.f6255a = new WeakReference<>(aVar);
        }

        @Override // com.taobao.android.a11y.ability.ocr.OCRBatchManager.b
        public void a(HashMap<String, View> hashMap) {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87f5b304", new Object[]{this, hashMap});
                return;
            }
            WeakReference<a> weakReference = this.f6255a;
            if (weakReference != null && (aVar = weakReference.get()) != null) {
                a.a(aVar, new ArrayList(hashMap.keySet()));
            }
        }
    }

    static {
        t2o.a(335544334);
    }

    public static /* synthetic */ void a(a aVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33df9636", new Object[]{aVar, list});
        } else {
            aVar.q(list);
        }
    }

    public static /* synthetic */ String b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b60cc90e", new Object[]{aVar, str});
        }
        aVar.b = str;
        return str;
    }

    public static /* synthetic */ String c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62986eb9", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static /* synthetic */ String d(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85ccfcad", new Object[]{aVar, str});
        }
        aVar.c = str;
        return str;
    }

    public static /* synthetic */ boolean e(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99be788e", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.getClass();
        return z;
    }

    public static /* synthetic */ boolean f(a aVar, OCRResponseData oCRResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ae9584d", new Object[]{aVar, oCRResponseData})).booleanValue();
        }
        return aVar.s(oCRResponseData);
    }

    public static /* synthetic */ void g(a aVar, List list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d074ad05", new Object[]{aVar, list, str});
        } else {
            aVar.v(list, str);
        }
    }

    public static /* synthetic */ String h(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4cdcb29", new Object[]{aVar, str});
        }
        aVar.d = str;
        return str;
    }

    public static /* synthetic */ View i(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fc551a18", new Object[]{aVar, str});
        }
        return aVar.r(str);
    }

    public static /* synthetic */ void j(a aVar, View view, OCRResultData oCRResultData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f4ee51", new Object[]{aVar, view, oCRResultData});
        } else {
            aVar.w(view, oCRResultData);
        }
    }

    public static /* synthetic */ Map k(a aVar, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e7c8e83", new Object[]{aVar, view, str});
        }
        return aVar.l(view, str);
    }

    public final Map<String, String> l(View view, String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1cf68fa8", new Object[]{this, view, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("image_url", str);
        CharSequence contentDescription = view.getContentDescription();
        if (contentDescription == null) {
            str2 = Boolean.FALSE.toString();
        } else {
            str2 = String.valueOf(contentDescription.toString().startsWith("表格识别结果："));
        }
        hashMap.put("is_table", str2);
        if (contentDescription == null) {
            str3 = "";
        } else {
            str3 = contentDescription.toString();
        }
        hashMap.put("a11y_content", str3);
        hashMap.put("hitTableRecoGray", this.d);
        return hashMap;
    }

    public final String m(OCRResultData oCRResultData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b382762", new Object[]{this, oCRResultData});
        }
        if (oCRResultData == null) {
            return "";
        }
        if (Boolean.TRUE.toString().equals(oCRResultData.b())) {
            return "表格识别结果：" + oCRResultData.a();
        }
        return "图片识别结果: " + oCRResultData.a();
    }

    public final void n(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd97d5e", new Object[]{this, list});
            return;
        }
        OCRRequestParams oCRRequestParams = new OCRRequestParams();
        oCRRequestParams.setImgList(JSON.toJSONString(list));
        new A11yMtopClient(new TableOCRRequest(oCRRequestParams), new C0326a(list), OCRResponseData.class).execute();
    }

    public void o(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1133f822", new Object[]{this, str, view});
        } else if (!TextUtils.isEmpty(str) && view != null && tb.d.c(view.getContext())) {
            y(str, view);
            if (!this.f6251a || !mh4.a()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                q(arrayList);
            } else if (t(str)) {
                OCRBatchManager.e().d(str, view);
            }
        }
    }

    @Deprecated
    public void p(String str, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154bbef2", new Object[]{this, str, view, new Boolean(z)});
        } else if (tb.d.c(view.getContext())) {
            x(z);
            o(str, view);
        }
    }

    public final void q(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93d4757", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            Iterator it = new ArrayList(list).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str)) {
                    if (!t(str)) {
                        list.remove(str);
                    } else {
                        String c2 = rov.c(str);
                        if (!str.equals(c2)) {
                            list.add(c2);
                            list.remove(str);
                        }
                        if (rov.e(str)) {
                            list.remove(str);
                        }
                    }
                }
            }
            if (!list.isEmpty()) {
                n(list);
            }
        }
    }

    public final View r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b91fa27d", new Object[]{this, str});
        }
        WeakReference weakReference = (WeakReference) ((HashMap) e).get(rov.c(str));
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final boolean s(OCRResponseData oCRResponseData) {
        Map<String, OCRResponseData.OCRResponseItemData> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7434246d", new Object[]{this, oCRResponseData})).booleanValue();
        }
        if (oCRResponseData != null && Boolean.TRUE.toString().equalsIgnoreCase(oCRResponseData.successful) && (map = oCRResponseData.data) != null && !map.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56ea7db3", new Object[]{this, str})).booleanValue();
        }
        View r = r(str);
        u(r, str);
        OCRResultData b2 = nbk.c().b(str);
        if (b2 != null) {
            w(r, b2);
            return false;
        }
        w(r, new OCRResultData(this.b, OCRResultData.ResultType.HOLD));
        return true;
    }

    public final void u(View view, String str) {
        View.AccessibilityDelegate accessibilityDelegate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88d775d", new Object[]{this, view, str});
        } else if (view != null) {
            accessibilityDelegate = view.getAccessibilityDelegate();
            view.setAccessibilityDelegate(new c(str, view, accessibilityDelegate));
        }
    }

    public final void v(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3afa2ff", new Object[]{this, list, str});
        } else if (list != null && !list.isEmpty()) {
            for (String str2 : list) {
                View r = r(str2);
                if (r != null) {
                    w(r, new OCRResultData(str, OCRResultData.ResultType.FAIL));
                }
            }
        }
    }

    public final void w(View view, OCRResultData oCRResultData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b6190", new Object[]{this, view, oCRResultData});
        } else if (view != null && oCRResultData != null) {
            int i = d.$SwitchMap$com$taobao$android$a11y$ability$ocr$OCRResultData$ResultType[oCRResultData.c().ordinal()];
            if (i == 1) {
                ewu.d(view, m(oCRResultData));
            } else if (i == 2) {
                ewu.c(view, oCRResultData.a());
            } else if (i == 3) {
                ewu.b(view, oCRResultData.a());
            }
        }
    }

    public void x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73fab26b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f6251a = z;
        if (z) {
            OCRBatchManager.e().g(new f(this));
        }
    }

    public final void y(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ddfbcaa", new Object[]{this, str, view});
            return;
        }
        Iterator it = new ArrayList(((HashMap) e).keySet()).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            View r = r(str2);
            if (r != null && r == view) {
                ((HashMap) e).remove(str2);
            }
        }
        ((HashMap) e).put(rov.c(str), new WeakReference(view));
        view.setAccessibilityDelegate(new b(this));
    }
}
