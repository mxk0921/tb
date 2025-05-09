package tb;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class boj implements th9, xnj, w4k<boj> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<xb4> componentFilterItems;
    private boolean mInit = false;
    private final xnj mNavProcessor;
    private boj mNextNode;
    private boolean mSkip;
    private List<dnv> uriFilterItems;

    static {
        t2o.a(578814050);
        t2o.a(578814030);
        t2o.a(578814049);
        t2o.a(578814057);
    }

    public boj(xnj xnjVar) {
        this.mNavProcessor = xnjVar;
    }

    public void addComponentFilterItem(xb4 xb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb86c74", new Object[]{this, xb4Var});
            return;
        }
        if (this.componentFilterItems == null) {
            this.componentFilterItems = new ArrayList();
        }
        this.componentFilterItems.add(xb4Var);
    }

    public boolean addSchemaWhenDeficiency() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd2dd70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void addUriFilterItem(dnv dnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba9d994", new Object[]{this, dnvVar});
            return;
        }
        if (this.uriFilterItems == null) {
            this.uriFilterItems = new ArrayList();
        }
        this.uriFilterItems.add(dnvVar);
    }

    public th9 asFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (th9) ipChange.ipc$dispatch("fda8e58b", new Object[]{this});
        }
        return this;
    }

    public xnj asNavProcessor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xnj) ipChange.ipc$dispatch("35f32deb", new Object[]{this});
        }
        return this;
    }

    public w4k asNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w4k) ipChange.ipc$dispatch("69d4ed4b", new Object[]{this});
        }
        return this;
    }

    public final boolean execute(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d54ee8a1", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        return process(intent, zmjVar);
    }

    public boolean filter(Intent intent, zmj zmjVar) {
        ComponentName component;
        List<dnv> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b17a03e", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        Uri uriCompat = getUriCompat(intent.getData());
        if (!(uriCompat == null || (list = this.uriFilterItems) == null || list.isEmpty())) {
            String scheme = uriCompat.getScheme();
            String host = uriCompat.getHost();
            String path = uriCompat.getPath();
            for (dnv dnvVar : this.uriFilterItems) {
                if (scheme == null || dnvVar.schemeFilter(scheme)) {
                    if (host == null || dnvVar.hostFilter(host)) {
                        if (path == null || dnvVar.pathFilter(path)) {
                            if (dnvVar.queryFilter(uriCompat)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        if (!(this.componentFilterItems == null || (component = intent.getComponent()) == null || this.componentFilterItems.isEmpty())) {
            String packageName = component.getPackageName();
            String className = component.getClassName();
            for (xb4 xb4Var : this.componentFilterItems) {
                if (xb4Var.b(packageName) && xb4Var.a(className)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Uri getUriCompat(Uri uri) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("38e7ba7f", new Object[]{this, uri});
        }
        if (!addSchemaWhenDeficiency()) {
            return uri;
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            String uri2 = uri.toString();
            if (uri2.startsWith(itw.URL_SEPARATOR)) {
                str = "http:".concat(uri2);
            } else {
                str = h1p.HTTP_PREFIX.concat(uri2);
            }
        } else if (scheme.startsWith(itw.URL_SEPARATOR)) {
            str = "http:" + uri;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return uri;
        }
        TLog.loge("Nav", "The Url used to determine has a scheme added, urlString: " + str);
        return Uri.parse(str);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return this.mNavProcessor.name();
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        return this.mNavProcessor.process(intent, zmjVar);
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        if (!this.mInit) {
            this.mInit = true;
            this.mSkip = this.mNavProcessor.skip();
        }
        return this.mSkip;
    }

    public final void addNext(boj bojVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a8b9136", new Object[]{this, bojVar});
        } else {
            this.mNextNode = bojVar;
        }
    }

    public final boj getNext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (boj) ipChange.ipc$dispatch("5bfc6f71", new Object[]{this}) : this.mNextNode;
    }
}
