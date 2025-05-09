package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class d57<FROM> implements omd<FROM, Map<String, Map<String, List<String>>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Map<String, List<String>>> f17588a = new HashMap();
    public boolean b;

    static {
        t2o.a(682622981);
        t2o.a(676331663);
    }

    @Override // tb.omd
    public List<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("10e2f26", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        if (this.f17588a.containsKey(str)) {
            return this.f17588a.get(str).get("default");
        }
        return new ArrayList();
    }

    @Override // tb.omd
    public boolean b(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba5bfd88", new Object[]{this, str, str2, strArr})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "default";
        }
        if (!this.f17588a.containsKey(str) || !this.f17588a.get(str).containsKey(str2)) {
            return true;
        }
        return this.f17588a.get(str).get(str2).containsAll(Arrays.asList(strArr));
    }

    @Override // tb.omd
    public void c(rmd<FROM, Map<String, Map<String, List<String>>>> rmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6fb1a7", new Object[]{this, rmdVar});
            return;
        }
        this.f17588a = rmdVar.generate();
        this.b = true;
    }

    @Override // tb.omd
    public List<String> d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a5d71e5c", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        if (this.f17588a.containsKey(str)) {
            return this.f17588a.get(str).get(str2);
        }
        return new ArrayList();
    }

    @Override // tb.omd
    public boolean isInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue();
        }
        return this.b;
    }
}
