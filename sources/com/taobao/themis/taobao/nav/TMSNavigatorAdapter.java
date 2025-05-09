package com.taobao.themis.taobao.nav;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.q9s;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/taobao/themis/taobao/nav/TMSNavigatorAdapter;", "Lcom/taobao/themis/kernel/adapter/INavigatorAdapter;", "<init>", "()V", "Landroid/content/Context;", "context", "", "url", "Landroid/os/Bundle;", "extras", "opts", "", "", "config", "", "openURL", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/Map;)Z", "Companion", "a", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSNavigatorAdapter implements INavigatorAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(847249538);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(847249537);
        t2o.a(839909476);
    }

    @Override // com.taobao.themis.kernel.adapter.INavigatorAdapter
    public boolean openURL(Context context, String str, Bundle bundle, Bundle bundle2, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("deb4b883", new Object[]{this, context, str, bundle, bundle2, map})).booleanValue();
        }
        ckf.g(context, "context");
        ckf.g(str, "url");
        if (q9s.D2()) {
            Nav withExtras = Nav.from(context).withOptions(bundle2).withExtras(bundle);
            if (map != null) {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String str2 = null;
                    switch (key.hashCode()) {
                        case -364238064:
                            if (!key.equals("skipAllProcessor")) {
                                break;
                            } else {
                                withExtras.skipAllProcessors();
                                break;
                            }
                        case -9888733:
                            if (!key.equals("className")) {
                                break;
                            } else {
                                String packageName = context.getPackageName();
                                Object value = entry.getValue();
                                if (value instanceof String) {
                                    str2 = (String) value;
                                }
                                withExtras.withClassName(packageName, str2);
                                break;
                            }
                        case 50511102:
                            if (!key.equals("category")) {
                                break;
                            } else {
                                Object value2 = entry.getValue();
                                if (value2 instanceof String) {
                                    str2 = (String) value2;
                                }
                                withExtras.withCategory(str2);
                                break;
                            }
                        case 611038506:
                            if (!key.equals("allowEscape")) {
                                break;
                            } else {
                                withExtras.allowEscape();
                                break;
                            }
                        case 755823694:
                            if (!key.equals("skipPreProcessor")) {
                                break;
                            } else {
                                withExtras.skipPreprocess();
                                break;
                            }
                        case 1069832742:
                            if (!key.equals("disallowLoopback")) {
                                break;
                            } else {
                                withExtras.disallowLoopback();
                                break;
                            }
                        case 1428875869:
                            if (!key.equals("disableTransition")) {
                                break;
                            } else {
                                withExtras.disableTransition();
                                break;
                            }
                    }
                }
            }
            return withExtras.toUri(str);
        } else if (context instanceof Activity) {
            if (!Nav.from(context).withOptions(bundle2).withExtras(bundle).forResult(38138).toUri(str)) {
                return Nav.from(context).withOptions(bundle2).withExtras(bundle).forResult(38138).allowEscape().toUri(str);
            }
            return true;
        } else if (!Nav.from(context).withOptions(bundle2).withExtras(bundle).toUri(str)) {
            return Nav.from(context).withOptions(bundle2).withExtras(bundle).allowEscape().toUri(str);
        } else {
            return true;
        }
    }
}
