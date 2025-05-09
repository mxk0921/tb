package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import com.taobao.android.dinamicx.DXDarkModeCenter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DinamicViewAdvancedConstructor";
    private boolean isInitialize = false;
    private boolean isNeedReflect;
    private boolean isRunSuperMethod;
    private List<b> methodInfos;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sn7.access$000(sn7.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Method f28157a;
        public final String[] b;
        public final Class[] c;

        static {
            t2o.a(444596275);
        }

        public b(Method method, String[] strArr, Class[] clsArr) {
            this.f28157a = method;
            this.b = strArr;
            this.c = clsArr;
        }
    }

    static {
        t2o.a(444596273);
    }

    public sn7() {
        gn7.a(new a());
    }

    public static /* synthetic */ void access$000(sn7 sn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2819d3", new Object[]{sn7Var});
        } else {
            sn7Var.initialize();
        }
    }

    private b findMethodForAttr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d866a0f8", new Object[]{this, str});
        }
        for (b bVar : this.methodInfos) {
            for (String str2 : bVar.b) {
                if (TextUtils.equals(str, str2)) {
                    return bVar;
                }
            }
        }
        return null;
    }

    private void initialize() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        if (findSetAttributesMethod() == null) {
            z = true;
        }
        this.isNeedReflect = z;
        scanAllDinamicAttrMethods();
        this.isInitialize = true;
    }

    private void scanAllDinamicAttrMethods() {
        Method[] methods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960ad53d", new Object[]{this});
            return;
        }
        try {
            this.methodInfos = new ArrayList();
            for (Method method : getClassLoader().loadClass(getClass().getName()).getMethods()) {
                if (method.isAnnotationPresent(DinamicAttr.class)) {
                    String[] attrSet = ((DinamicAttr) method.getAnnotation(DinamicAttr.class)).attrSet();
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (attrSet.length > 0 && parameterTypes.length > 0 && parameterTypes.length - attrSet.length == 1) {
                        this.methodInfos.add(new b(method, attrSet, parameterTypes));
                    } else if (tl7.f()) {
                        ym7.a(tl7.TAG, "Senioronstructor scanAllDinamicAttrMethods function info error");
                    }
                }
            }
        } catch (Throwable th) {
            if (tl7.f()) {
                ym7.l(tl7.TAG, th, "Senioronstructor scanAllDinamicAttrMethods exception");
            }
        }
    }

    @Deprecated
    public void applyDefaultProperty(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a0aa03", new Object[]{this, view});
        }
    }

    public void bindDataImpl(View view, Map<String, Object> map, ArrayList<String> arrayList, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9560697c", new Object[]{this, view, map, arrayList, bn7Var});
        } else if (needBindData(view, map, bn7Var)) {
            setAttributes(view, map, arrayList, bn7Var);
        }
    }

    public ClassLoader getClassLoader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClassLoader) ipChange.ipc$dispatch("8d8cecd6", new Object[]{this});
        }
        return getClass().getClassLoader();
    }

    public Class getDebugClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("25a5028f", new Object[]{this});
        }
        try {
            return getClassLoader().loadClass(getClass().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        return new View(context, attributeSet);
    }

    public View initializeViewWithModule(String str, Context context, AttributeSet attributeSet, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("65343113", new Object[]{this, str, context, attributeSet, bn7Var});
        }
        return initializeView(str, context, attributeSet);
    }

    public boolean needBindData(View view, Map<String, Object> map, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c12592e", new Object[]{this, view, map, bn7Var})).booleanValue();
        }
        if (map.containsKey("dVisibility")) {
            Object obj = map.get("dVisibility");
            if (obj instanceof String) {
                setVisibility(view, (String) obj);
            }
        }
        if (view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public void setAccessibilityHidden(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d17a21f", new Object[]{this, view, new Boolean(z)});
        } else if (z) {
            view.setImportantForAccessibility(2);
        } else {
            view.setImportantForAccessibility(1);
        }
    }

    public void setAccessibilityText(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d046bc", new Object[]{this, view, str});
        } else {
            view.setContentDescription(str);
        }
    }

    public void setAlpha(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c4359", new Object[]{this, view, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                view.setAlpha(Float.valueOf(str).floatValue());
            } catch (NumberFormatException unused) {
                view.setAlpha(1.0f);
            }
        } else {
            view.setAlpha(1.0f);
        }
    }

    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae33af2a", new Object[]{this, view, map, arrayList, bn7Var});
            return;
        }
        if (arrayList.contains("dBackgroundColor") || arrayList.contains("dCornerRadius") || arrayList.contains("dBorderColor") || arrayList.contains("dBorderWidth")) {
            setBackground(view, (String) map.get("dCornerRadius"), (String) map.get("dBorderColor"), (String) map.get("dBorderWidth"), (String) map.get("dBackgroundColor"));
        }
        if (arrayList.contains("dAlpha")) {
            setAlpha(view, (String) map.get("dAlpha"));
        }
        if (arrayList.contains("dAccessibilityText")) {
            setAccessibilityText(view, (String) map.get("dAccessibilityText"));
        }
        if (arrayList.contains("dAccessibilityTextHidden")) {
            String str = (String) map.get("dAccessibilityTextHidden");
            if (!TextUtils.isEmpty(str)) {
                setAccessibilityHidden(view, Boolean.valueOf(str).booleanValue());
            } else {
                setAccessibilityHidden(view, true);
            }
        }
        if (arrayList.contains("dDisableDarkMode")) {
            setForceDark(view, Boolean.valueOf((String) map.get("dDisableDarkMode")).booleanValue());
        }
        if (!this.isInitialize) {
            initialize();
        }
        if (this.isNeedReflect) {
            HashMap hashMap = new HashMap();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                hashMap.put(next, map.get(next));
            }
            setSpecificAttributes(view, hashMap, bn7Var);
        }
    }

    public void setBackground(View view, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c88fce3", new Object[]{this, view, str, str2, str3, str4});
            return;
        }
        Drawable background = view.getBackground();
        if (background != null && (background instanceof GradientDrawable)) {
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            int d = y45.d(str4, 0);
            if (!TextUtils.isEmpty(str4)) {
                gradientDrawable.setColor(d);
            }
            if (!TextUtils.isEmpty(str)) {
                gradientDrawable.setCornerRadius(owo.e(view.getContext(), str, 0));
            }
            if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
                gradientDrawable.setStroke(owo.e(view.getContext(), str3, 0), y45.d(str2, d));
            }
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            int d2 = y45.d(str4, 0);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            int e = owo.e(view.getContext(), str, 0);
            int d3 = y45.d(str2, d2);
            int e2 = owo.e(view.getContext(), str3, 0);
            gradientDrawable2.setCornerRadius(e);
            gradientDrawable2.setShape(0);
            gradientDrawable2.setColor(d2);
            if (e2 > 0) {
                gradientDrawable2.setStroke(e2, d3);
            }
            view.setBackground(gradientDrawable2);
        } else {
            view.setBackgroundColor(y45.d(str4, 0));
        }
    }

    public void setEvents(View view, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6e73e3", new Object[]{this, view, bn7Var});
        } else {
            new om7().b(view, bn7Var);
        }
    }

    public void setForceDark(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4f3508", new Object[]{this, view, new Boolean(z)});
        } else if (z) {
            DXDarkModeCenter.a(null, view);
        }
    }

    public void applyDefaultProperty(View view, Map<String, Object> map, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e377895", new Object[]{this, view, map, bn7Var});
            return;
        }
        if (!map.containsKey("dBackgroundColor")) {
            view.setBackgroundColor(0);
        }
        if (!map.containsKey("dAlpha")) {
            view.setAlpha(1.0f);
        }
        applyDefaultProperty(view);
    }

    public void setVisibility(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5e8361", new Object[]{this, view, str});
        } else if (TextUtils.equals("visible", str)) {
            view.setVisibility(0);
        } else if (TextUtils.equals("invisible", str)) {
            view.setVisibility(4);
        } else if (TextUtils.equals("gone", str)) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }

    private Method findSetAttributesMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("27b83c56", new Object[]{this});
        }
        try {
            return getClassLoader().loadClass(getClass().getName()).getDeclaredMethod("setAttributes", View.class, Map.class, ArrayList.class, bn7.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    public final en7 handleAttributeSet(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (en7) ipChange.ipc$dispatch("2c96edcd", new Object[]{this, attributeSet});
        }
        en7 en7Var = new en7();
        int attributeCount = attributeSet.getAttributeCount();
        if (attributeCount <= 0) {
            return en7Var;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = attributeSet.getAttributeName(i);
            String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", attributeName);
            if (attributeValue != null) {
                if (attributeName.startsWith("on")) {
                    hashMap3.put(attributeName, attributeValue);
                } else if (attributeValue.startsWith("$") || attributeValue.startsWith("@")) {
                    hashMap2.put(attributeName, attributeValue);
                } else {
                    hashMap.put(attributeName, attributeValue);
                }
            }
        }
        en7Var.b = hashMap;
        en7Var.c = Collections.unmodifiableMap(hashMap2);
        en7Var.d = Collections.unmodifiableMap(hashMap3);
        return en7Var;
    }

    private void setSpecificAttributes(View view, Map<String, Object> map, bn7 bn7Var) {
        Object obj;
        View view2 = view;
        List<b> list = this.methodInfos;
        if (!(list == null || list.size() == 0)) {
            en7 c = vn7.c(view);
            Map<String, Object> map2 = c.b;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (TextUtils.equals((String) it.next(), entry.getKey())) {
                            break;
                        }
                    } else {
                        b findMethodForAttr = findMethodForAttr(entry.getKey());
                        if (findMethodForAttr != null) {
                            Method method = findMethodForAttr.f28157a;
                            String[] strArr = findMethodForAttr.b;
                            if (strArr.length > 1) {
                                arrayList.addAll(Arrays.asList(strArr));
                            }
                            Class[] clsArr = findMethodForAttr.c;
                            Object[] objArr = new Object[clsArr.length];
                            int i = 0;
                            if (!clsArr[0].isInstance(view2)) {
                                bn7Var.e().b().a(mm7.ERROR_CODE_VIEW_EXCEPTION, c.f18692a);
                                if (tl7.f()) {
                                    ym7.e(tl7.TAG, "Senioronstructor first param class not match");
                                }
                            } else {
                                objArr[0] = view2;
                                while (i < strArr.length) {
                                    if ("module".equals(strArr[i])) {
                                        obj = bn7Var.c();
                                    } else if ("dinamicContext".equals(strArr[i])) {
                                        obj = bn7Var.b();
                                    } else if ("dinamicParams".equals(strArr[i])) {
                                        obj = bn7Var;
                                    } else if (map.containsKey(strArr[i])) {
                                        obj = map.get(strArr[i]);
                                    } else {
                                        obj = ((HashMap) map2).get(strArr[i]);
                                    }
                                    int i2 = i + 1;
                                    if (clsArr[i2].isInstance(obj)) {
                                        objArr[i2] = obj;
                                    } else {
                                        if (obj != null) {
                                            bn7Var.e().b().a(mm7.ERROR_CODE_VIEW_EXCEPTION, c.f18692a);
                                        }
                                        if (tl7.f()) {
                                            String str = strArr[i];
                                            ym7.e(tl7.TAG, "AdvancedConstructor " + str + " value is null or not exist");
                                        }
                                        objArr[i2] = null;
                                    }
                                    i = i2;
                                }
                                try {
                                    method.invoke(this, objArr);
                                } catch (Exception e) {
                                    bn7Var.e().b().a(mm7.ERROR_CODE_VIEW_EXCEPTION, c.f18692a);
                                    if (tl7.f()) {
                                        ym7.l(tl7.TAG, e, "AdvancedConstructor method invoke exception");
                                    }
                                }
                                view2 = view;
                            }
                        }
                    }
                }
            }
        }
    }
}
