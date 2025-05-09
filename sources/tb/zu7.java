package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zu7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<onf> f33016a = new ArrayList();
    public upl b = new upl();

    public zu7() {
    }

    public boolean a() {
        List<onf> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("406022a1", new Object[]{this})).booleanValue();
        }
        if (this.b == null || (list = this.f33016a) == null || list.isEmpty()) {
            fs7.h("DownloadRequest", "validate", "param is null");
            return false;
        } else if (TextUtils.isEmpty(this.b.g)) {
            fs7.h("DownloadRequest", "validate", "param fileStorePath is null");
            return false;
        } else {
            for (onf onfVar : this.f33016a) {
                if (TextUtils.isEmpty(onfVar.f25507a)) {
                    fs7.h("DownloadRequest", "validate", "param url is null");
                    return false;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (onf onfVar2 : this.f33016a) {
                if (!arrayList.contains(onfVar2)) {
                    arrayList.add(onfVar2);
                }
            }
            this.f33016a = arrayList;
            return true;
        }
    }

    public zu7(String str) {
        onf onfVar = new onf();
        onfVar.f25507a = str;
        this.f33016a.add(onfVar);
    }

    public zu7(String... strArr) {
        for (String str : strArr) {
            onf onfVar = new onf();
            onfVar.f25507a = str;
            this.f33016a.add(onfVar);
        }
    }
}
