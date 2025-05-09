package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import de.greenrobot.event.EventBusException;
import java.util.HashSet;
import java.util.Set;
import tb.nde;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class abx implements ude, nde {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Activity mActivity;
    private yko mCore;
    private final ude mParent;
    private final Set<String> mScopes;
    private final Set<nde> mChildren = new HashSet();
    private hj8 mEventBus = null;
    private final Set<Object> mSubscribers = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ abx f15650a;

        public a(abx abxVar) {
            this.f15650a = abxVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f15650a.addChild(abx.this);
            }
        }
    }

    static {
        t2o.a(993002015);
        t2o.a(993002008);
        t2o.a(993002006);
    }

    public abx(Activity activity, ude udeVar) {
        this.mActivity = activity;
        this.mParent = udeVar;
        this.mCore = udeVar.getCore();
        int i = 1;
        if (udeVar instanceof abx) {
            abx abxVar = (abx) udeVar;
            activity.runOnUiThread(new a(abxVar));
            String scopeTag = getScopeTag();
            HashSet hashSet = new HashSet(abxVar.getScopes().size() + (scopeTag == null ? 0 : i));
            this.mScopes = hashSet;
            hashSet.addAll(abxVar.getScopes());
            if (scopeTag != null) {
                hashSet.add(scopeTag);
                return;
            }
            return;
        }
        String scopeTag2 = getScopeTag();
        HashSet hashSet2 = new HashSet(scopeTag2 == null ? 0 : i);
        this.mScopes = hashSet2;
        if (scopeTag2 != null) {
            hashSet2.add(scopeTag2);
        }
    }

    public final void addChild(nde ndeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88698af", new Object[]{this, ndeVar});
            return;
        }
        this.mChildren.add(ndeVar);
        onChildAdded(ndeVar);
    }

    public final yko c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("827434f7", new Object[]{this});
        }
        return this.mCore;
    }

    @Override // tb.nde
    public void destroyAndRemoveFromParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120cd83c", new Object[]{this});
            return;
        }
        destroyComponent();
        ude udeVar = this.mParent;
        if (udeVar instanceof abx) {
            ((abx) udeVar).removeChild(this);
        }
    }

    public final void destroyComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a20b12a", new Object[]{this});
            return;
        }
        if (this.mChildren.size() > 0) {
            for (nde ndeVar : this.mChildren) {
                if (ndeVar instanceof abx) {
                    ((abx) ndeVar).destroyComponent();
                } else if (ndeVar instanceof WidgetViewHolder) {
                    ((WidgetViewHolder) ndeVar).e0();
                }
            }
        }
        hj8 obtainScopeEventBus = getRoot().obtainScopeEventBus();
        for (Object obj : this.mSubscribers) {
            obtainScopeEventBus.s(obj);
        }
        onComponentDestroy();
    }

    public JSONObject dumpDebugInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("980ff734", new Object[]{this});
        }
        return new JSONObject();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [tb.nde] */
    /* JADX WARN: Type inference failed for: r0v3, types: [tb.nde] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [tb.nde] */
    public nde findComponentOfScope(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nde) ipChange.ipc$dispatch("d707514b", new Object[]{this, str});
        }
        abx abxVar = this;
        while (!TextUtils.equals(abxVar.getScopeTag(), str)) {
            ude parent = abxVar.getParent();
            if (parent instanceof nde) {
                abxVar = (nde) parent;
                continue;
            } else {
                abxVar = 0;
                continue;
            }
            if (abxVar == 0) {
                break;
            }
        }
        return abxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [tb.nde] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [tb.nde] */
    public final <T> T findParentOfClass(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("a801e27a", new Object[]{this, cls});
        }
        abx abxVar = this;
        do {
            ude parent = abxVar.getParent();
            if (cls.isInstance(parent)) {
                return cls.cast(parent);
            }
            if (parent instanceof nde) {
                abxVar = (nde) parent;
                continue;
            } else {
                abxVar = 0;
                continue;
            }
        } while (abxVar != 0);
        return null;
    }

    public View findView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("86c73ae0", new Object[]{this, new Integer(i)});
        }
        return this.mActivity.findViewById(i);
    }

    public final Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.mActivity;
    }

    @Override // tb.ude
    public final yko getCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("ce8ff685", new Object[]{this});
        }
        return this.mCore;
    }

    public abstract String getLogTag();

    @Override // tb.nde
    public final ude getParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ude) ipChange.ipc$dispatch("65261d7c", new Object[]{this});
        }
        return this.mParent;
    }

    public nde getRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nde) ipChange.ipc$dispatch("ce1f4f40", new Object[]{this});
        }
        nde ndeVar = this;
        while (true) {
            ude parent = ndeVar.getParent();
            if (!(parent instanceof nde)) {
                return ndeVar;
            }
            ndeVar = (nde) parent;
        }
    }

    public String getScopeTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53eba25d", new Object[]{this});
        }
        return null;
    }

    public final Set<String> getScopes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("65c13c8b", new Object[]{this});
        }
        return this.mScopes;
    }

    public final void logError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f57b0b5", new Object[]{this, str});
        } else {
            c().l().d(getLogTag(), str);
        }
    }

    public final void logWarn(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff976fb", new Object[]{this, str});
        } else {
            c().l().A(getLogTag(), str);
        }
    }

    @Override // tb.nde
    public final hj8 obtainScopeEventBus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hj8) ipChange.ipc$dispatch("60092b94", new Object[]{this});
        }
        if (this.mEventBus == null) {
            this.mEventBus = agg.a();
        }
        return this.mEventBus;
    }

    public void onChildAdded(nde ndeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a40dc27", new Object[]{this, ndeVar});
        }
    }

    public void onChildRemoved(nde ndeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18e50587", new Object[]{this, ndeVar});
        }
    }

    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
        }
    }

    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
        }
    }

    @Override // tb.nde
    public final void onCtxDestroyInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92298f6", new Object[]{this});
            return;
        }
        for (nde ndeVar : this.mChildren) {
            ndeVar.onCtxDestroyInternal();
        }
        onCtxDestroy();
    }

    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
        }
    }

    @Override // tb.nde
    public final void onCtxPauseInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690eaf2", new Object[]{this});
            return;
        }
        for (nde ndeVar : this.mChildren) {
            ndeVar.onCtxPauseInternal();
        }
        onCtxPause();
    }

    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
        }
    }

    @Override // tb.nde
    public final void onCtxResumeInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd57b79", new Object[]{this});
            return;
        }
        for (nde ndeVar : this.mChildren) {
            ndeVar.onCtxResumeInternal();
        }
        onCtxResume();
    }

    public void onCtxStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c591371", new Object[]{this});
        }
    }

    @Override // tb.nde
    public void onCtxStopInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da57fdce", new Object[]{this});
            return;
        }
        for (nde ndeVar : this.mChildren) {
            ndeVar.onCtxStopInternal();
        }
        onCtxStop();
    }

    public final void postEvent(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e40efd", new Object[]{this, obj});
        } else {
            getRoot().obtainScopeEventBus().k(obj);
        }
    }

    @Override // tb.nde
    public final void printTree(StringBuilder sb, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85bc8aa", new Object[]{this, sb, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append(toString());
        sb.append(":");
        if (getScopeTag() != null) {
            str = getScopeTag();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append('\n');
        if (this.mChildren.size() != 0) {
            for (nde ndeVar : this.mChildren) {
                ndeVar.printTree(sb, i + 1);
            }
        }
    }

    public final void removeChild(nde ndeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63cea12", new Object[]{this, ndeVar});
            return;
        }
        this.mChildren.remove(ndeVar);
        onChildRemoved(ndeVar);
    }

    public final <T> T searchWidget(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("35160968", new Object[]{this, cls});
        }
        return (T) getRoot().searchWidgetInSubTree(cls);
    }

    @Override // tb.nde
    public final <T> T searchWidgetInSubTree(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ac60b709", new Object[]{this, cls});
        }
        if (cls.isInstance(this)) {
            return cls.cast(this);
        }
        if (this.mChildren.isEmpty()) {
            return null;
        }
        for (nde ndeVar : this.mChildren) {
            T t = (T) ndeVar.searchWidgetInSubTree(cls);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return getClass().getSimpleName();
    }

    @Override // tb.nde
    public final boolean travel(nde.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d20179", new Object[]{this, aVar})).booleanValue();
        }
        if (!aVar.c(this)) {
            return false;
        }
        if (this.mChildren.size() != 0) {
            aVar.b();
            for (nde ndeVar : this.mChildren) {
                if (!ndeVar.travel(aVar)) {
                    return false;
                }
            }
            aVar.a();
        }
        return true;
    }

    public final void unsubscribeEvent(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ba62c", new Object[]{this, obj});
            return;
        }
        getRoot().obtainScopeEventBus().s(obj);
        this.mSubscribers.remove(obj);
    }

    public final void subscribeEvent(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204d3013", new Object[]{this, obj});
            return;
        }
        try {
            getRoot().obtainScopeEventBus().o(obj);
            this.mSubscribers.add(obj);
        } catch (EventBusException e) {
            c().l().f(getLogTag(), "register event throws exception", e, false);
        }
    }

    public final boolean postScopeEvent(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4c9cf17", new Object[]{this, obj, str})).booleanValue();
        }
        nde findComponentOfScope = findComponentOfScope(str);
        if (findComponentOfScope == null) {
            logError("scope not found: " + str + " for: " + obj.toString());
            return false;
        }
        findComponentOfScope.obtainScopeEventBus().k(obj);
        return true;
    }

    public final boolean subscribeScopeEvent(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ccdd541", new Object[]{this, obj, str})).booleanValue();
        }
        nde findComponentOfScope = findComponentOfScope(str);
        if (findComponentOfScope == null) {
            logError("scope not found: " + str + " for consumer: " + obj.toString());
            return false;
        }
        hj8 obtainScopeEventBus = findComponentOfScope.obtainScopeEventBus();
        if (!obtainScopeEventBus.i(obj)) {
            obtainScopeEventBus.o(obj);
        }
        return true;
    }

    public final boolean unsubscribeScopeEvent(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a319308", new Object[]{this, obj, str})).booleanValue();
        }
        nde findComponentOfScope = findComponentOfScope(str);
        if (findComponentOfScope == null) {
            logError("unregister scope not found:" + str + "for consumer" + obj.toString());
            return false;
        }
        findComponentOfScope.obtainScopeEventBus().s(obj);
        return true;
    }
}
