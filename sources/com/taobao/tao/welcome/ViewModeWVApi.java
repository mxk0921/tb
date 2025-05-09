package com.taobao.tao.welcome;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.a;
import java.util.concurrent.ConcurrentHashMap;
import tb.afg;
import tb.ajc;
import tb.t2o;
import tb.tdg;
import tb.vdg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ViewModeWVApi extends tdg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_IS_VIEW_MODE = "isViewMode";
    private static final String ACTION_OPEN = "requestPermission";
    private static final ConcurrentHashMap<String, b> actionExtensions = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements a.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vdg f12885a;

        public a(ViewModeWVApi viewModeWVApi, vdg vdgVar) {
            this.f12885a = vdgVar;
        }

        @Override // com.taobao.tao.welcome.a.d
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbbb0a8", new Object[]{this, new Integer(i)});
                return;
            }
            this.f12885a.b(ViewModeWVApi.access$000("permission rejected, actionId=" + i));
        }

        @Override // com.taobao.tao.welcome.a.d
        public void onPositive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82ab057f", new Object[]{this});
            } else {
                this.f12885a.e(ViewModeWVApi.access$000("permission authorized"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        boolean a(String str, vdg vdgVar);
    }

    static {
        t2o.a(734003243);
    }

    public static /* synthetic */ afg access$000(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (afg) ipChange.ipc$dispatch("68ef70ca", new Object[]{str});
        }
        return obtainResult(str);
    }

    public static /* synthetic */ Object ipc$super(ViewModeWVApi viewModeWVApi, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/welcome/ViewModeWVApi");
    }

    private static afg obtainResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (afg) ipChange.ipc$dispatch("2b6c05d8", new Object[]{str});
        }
        afg afgVar = new afg();
        afgVar.a("msg", str);
        return afgVar;
    }

    public static void registerActionListener(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e51a649", new Object[]{str, bVar});
        } else {
            actionExtensions.put(str, bVar);
        }
    }

    public static void unRegisterActionListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4c7697", new Object[]{str});
        } else {
            actionExtensions.remove(str);
        }
    }

    @Override // tb.tdg
    public boolean execute(String str, String str2, vdg vdgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9fa0928", new Object[]{this, str, str2, vdgVar})).booleanValue();
        }
        if (TextUtils.equals(str, "requestPermission")) {
            return requestPermission(vdgVar);
        }
        if (TextUtils.equals(str, ACTION_IS_VIEW_MODE)) {
            return isViewMode(vdgVar);
        }
        b bVar = actionExtensions.get(str);
        if (bVar != null) {
            return bVar.a(str2, vdgVar);
        }
        vdgVar.b(obtainResult("unsupported action: " + str));
        return false;
    }

    private boolean isViewMode(vdg vdgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60724d1f", new Object[]{this, vdgVar})).booleanValue();
        }
        ajc c = vdgVar.c();
        if (c == null) {
            vdgVar.b(obtainResult("webview of context is null"));
            return false;
        }
        Context context = c.getView().getContext();
        if (context instanceof Activity) {
            return ((Activity) context).getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).getInt(HostController.KEY_APP_VIEW_MODE, -1) == 1;
        }
        vdgVar.b(obtainResult("the container should be Android Activity"));
        return false;
    }

    private boolean requestPermission(vdg vdgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14fe2013", new Object[]{this, vdgVar})).booleanValue();
        }
        ajc c = vdgVar.c();
        if (c == null) {
            vdgVar.b(obtainResult("webview of context is null"));
            return false;
        }
        Context context = c.getView().getContext();
        if (!(context instanceof Activity)) {
            vdgVar.b(obtainResult("the container should be Android Activity"));
            return false;
        }
        Activity activity = (Activity) context;
        if (activity.getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).getInt(HostController.KEY_APP_VIEW_MODE, -1) != 1) {
            vdgVar.b(obtainResult("not in view mode, no need to request permission"));
            return false;
        }
        f.a(f.TYPE_GENERAL, activity, new a(this, vdgVar)).a();
        return true;
    }
}
