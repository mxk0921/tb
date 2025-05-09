package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class env implements dnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<String> queryFilters;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final env f18705a = new env();

        static {
            t2o.a(578814063);
        }

        public static /* synthetic */ env a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (env) ipChange.ipc$dispatch("82d586e5", new Object[0]);
            }
            return f18705a;
        }
    }

    static {
        t2o.a(578814062);
        t2o.a(578814061);
    }

    public static env getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (env) ipChange.ipc$dispatch("47197faa", new Object[0]);
        }
        return a.a();
    }

    public void addQueryFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925eac50", new Object[]{this, str});
            return;
        }
        if (this.queryFilters == null) {
            this.queryFilters = new ArrayList();
        }
        this.queryFilters.add(str);
    }

    @Override // tb.dnv
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    @Override // tb.dnv
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    @Override // tb.dnv
    public boolean queryFilter(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71a7f144", new Object[]{this, uri})).booleanValue();
        }
        List<String> list = this.queryFilters;
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (uri.isOpaque()) {
            return false;
        }
        for (String str : this.queryFilters) {
            if (uri.getQueryParameter(str) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.dnv
    public boolean schemeFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fb6ac52", new Object[]{this, str})).booleanValue();
        }
        return true;
    }
}
