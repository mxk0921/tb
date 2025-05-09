package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateRegistry;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.JvmStatic;
import kotlinx.coroutines.flow.m;
import tb.a07;
import tb.ajq;
import tb.ckf;
import tb.hfj;
import tb.jpu;
import tb.lfp;
import tb.yp9;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u000234B\u001f\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0017J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010\"\u001a\u00020!\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b$\u0010\u001fJ\u001f\u0010&\u001a\u00020!2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0010H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020!2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b(\u0010)R\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R$\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030.0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R(\u00101\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001000*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00102¨\u00065"}, d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "T", "key", "", "hasInitialValue", "initialValue", "Landroidx/lifecycle/MutableLiveData;", "getLiveDataInternal", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateProvider", "()Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "contains", "(Ljava/lang/String;)Z", "getLiveData", "(Ljava/lang/String;)Landroidx/lifecycle/MutableLiveData;", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "Ltb/ajq;", "getStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)Ltb/ajq;", "", "keys", "()Ljava/util/Set;", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "Ltb/xhv;", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "remove", "provider", "setSavedStateProvider", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V", "clearSavedStateProvider", "(Ljava/lang/String;)V", "", "regular", "Ljava/util/Map;", "savedStateProviders", "Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "liveDatas", "Ltb/hfj;", "flows", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "Companion", "SavingStateLiveData", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class SavedStateHandle {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEYS = "keys";
    private static final String VALUES = "values";
    private final Map<String, hfj<Object>> flows;
    private final Map<String, SavingStateLiveData<?>> liveDatas;
    private final Map<String, Object> regular;
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;
    private final Map<String, SavedStateRegistry.SavedStateProvider> savedStateProviders;
    public static final Companion Companion = new Companion(null);
    private static final Class<? extends Object>[] ACCEPTABLE_CLASSES = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0007R \u0010\u0003\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "()V", "ACCEPTABLE_CLASSES", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "KEYS", "", "VALUES", "createHandle", "Landroidx/lifecycle/SavedStateHandle;", "restoredState", "Landroid/os/Bundle;", "defaultState", "validateValue", "", "value", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }

        public final boolean validateValue(Object obj) {
            Class[] access$getACCEPTABLE_CLASSES$cp;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f5c4862", new Object[]{this, obj})).booleanValue();
            }
            if (obj == null) {
                return true;
            }
            for (Class cls : SavedStateHandle.access$getACCEPTABLE_CLASSES$cp()) {
                ckf.d(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }

        @JvmStatic
        public final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SavedStateHandle) ipChange.ipc$dispatch("8959103f", new Object[]{this, bundle, bundle2});
            }
            if (bundle != null) {
                ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
                ckf.d(classLoader);
                bundle.setClassLoader(classLoader);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw new IllegalStateException("Invalid bundle passed as restored state");
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = parcelableArrayList.get(i);
                    ckf.e(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                }
                return new SavedStateHandle(linkedHashMap);
            } else if (bundle2 == null) {
                return new SavedStateHandle();
            } else {
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    ckf.f(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new SavedStateHandle(hashMap);
            }
        }
    }

    public SavedStateHandle(Map<String, ? extends Object> map) {
        ckf.g(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: tb.ero
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle savedStateProvider$lambda$0;
                savedStateProvider$lambda$0 = SavedStateHandle.savedStateProvider$lambda$0(SavedStateHandle.this);
                return savedStateProvider$lambda$0;
            }
        };
        linkedHashMap.putAll(map);
    }

    public static final /* synthetic */ Class[] access$getACCEPTABLE_CLASSES$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class[]) ipChange.ipc$dispatch("852a4fc5", new Object[0]);
        }
        return ACCEPTABLE_CLASSES;
    }

    public static final /* synthetic */ Map access$getFlows$p(SavedStateHandle savedStateHandle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c7572057", new Object[]{savedStateHandle});
        }
        return savedStateHandle.flows;
    }

    public static final /* synthetic */ Map access$getRegular$p(SavedStateHandle savedStateHandle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9beb7420", new Object[]{savedStateHandle});
        }
        return savedStateHandle.regular;
    }

    @JvmStatic
    public static final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SavedStateHandle) ipChange.ipc$dispatch("8959103f", new Object[]{bundle, bundle2});
        }
        return Companion.createHandle(bundle, bundle2);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z, T t) {
        SavingStateLiveData<?> savingStateLiveData;
        SavingStateLiveData<?> savingStateLiveData2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLiveData) ipChange.ipc$dispatch("408f67be", new Object[]{this, str, new Boolean(z), t});
        }
        SavingStateLiveData<?> savingStateLiveData3 = this.liveDatas.get(str);
        if (savingStateLiveData3 instanceof MutableLiveData) {
            savingStateLiveData = savingStateLiveData3;
        } else {
            savingStateLiveData = null;
        }
        if (savingStateLiveData != null) {
            return savingStateLiveData;
        }
        if (this.regular.containsKey(str)) {
            savingStateLiveData2 = new SavingStateLiveData<>(this, str, this.regular.get(str));
        } else if (z) {
            this.regular.put(str, t);
            savingStateLiveData2 = new SavingStateLiveData<>(this, str, t);
        } else {
            savingStateLiveData2 = new SavingStateLiveData<>(this, str);
        }
        this.liveDatas.put(str, savingStateLiveData2);
        return savingStateLiveData2;
    }

    public final void clearSavedStateProvider(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28aaa019", new Object[]{this, str});
            return;
        }
        ckf.g(str, "key");
        this.savedStateProviders.remove(str);
    }

    public final boolean contains(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "key");
        return this.regular.containsKey(str);
    }

    public final <T> T get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("352acab", new Object[]{this, str});
        }
        ckf.g(str, "key");
        try {
            return (T) this.regular.get(str);
        } catch (ClassCastException unused) {
            remove(str);
            return null;
        }
    }

    public final <T> MutableLiveData<T> getLiveData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLiveData) ipChange.ipc$dispatch("36e99b37", new Object[]{this, str});
        }
        ckf.g(str, "key");
        MutableLiveData<T> liveDataInternal = getLiveDataInternal(str, false, null);
        ckf.e(liveDataInternal, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return liveDataInternal;
    }

    public final <T> ajq<T> getStateFlow(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ajq) ipChange.ipc$dispatch("e76e1d2d", new Object[]{this, str, t});
        }
        ckf.g(str, "key");
        Map<String, hfj<Object>> map = this.flows;
        hfj<Object> hfjVar = map.get(str);
        if (hfjVar == null) {
            if (!this.regular.containsKey(str)) {
                this.regular.put(str, t);
            }
            hfjVar = m.a(this.regular.get(str));
            this.flows.put(str, hfjVar);
            map.put(str, hfjVar);
        }
        return yp9.a(hfjVar);
    }

    public final Set<String> keys() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c3ce812a", new Object[]{this});
        }
        return lfp.j(lfp.j(this.regular.keySet(), this.savedStateProviders.keySet()), this.liveDatas.keySet());
    }

    public final <T> T remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("da166bbd", new Object[]{this, str});
        }
        ckf.g(str, "key");
        T t = (T) this.regular.remove(str);
        SavingStateLiveData<?> remove = this.liveDatas.remove(str);
        if (remove != null) {
            remove.detach();
        }
        this.flows.remove(str);
        return t;
    }

    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SavedStateRegistry.SavedStateProvider) ipChange.ipc$dispatch("583dd3ba", new Object[]{this});
        }
        return this.savedStateProvider;
    }

    public final <T> void set(String str, T t) {
        SavingStateLiveData<?> savingStateLiveData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ec3a8f", new Object[]{this, str, t});
            return;
        }
        ckf.g(str, "key");
        if (Companion.validateValue(t)) {
            SavingStateLiveData<?> savingStateLiveData2 = this.liveDatas.get(str);
            if (savingStateLiveData2 instanceof MutableLiveData) {
                savingStateLiveData = savingStateLiveData2;
            } else {
                savingStateLiveData = null;
            }
            if (savingStateLiveData != null) {
                savingStateLiveData.setValue(t);
            } else {
                this.regular.put(str, t);
            }
            hfj<Object> hfjVar = this.flows.get(str);
            if (hfjVar != null) {
                hfjVar.setValue(t);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Can't put value with type ");
        ckf.d(t);
        sb.append(t.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void setSavedStateProvider(String str, SavedStateRegistry.SavedStateProvider savedStateProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89a542fa", new Object[]{this, str, savedStateProvider});
            return;
        }
        ckf.g(str, "key");
        ckf.g(savedStateProvider, "provider");
        this.savedStateProviders.put(str, savedStateProvider);
    }

    public final <T> MutableLiveData<T> getLiveData(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLiveData) ipChange.ipc$dispatch("b2ccdb1b", new Object[]{this, str, t});
        }
        ckf.g(str, "key");
        return getLiveDataInternal(str, true, t);
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "", "key", "value", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V", "Ltb/xhv;", "setValue", "(Ljava/lang/Object;)V", Constants.Event.SLOT_LIFECYCLE.DETACH, "()V", "Ljava/lang/String;", "Landroidx/lifecycle/SavedStateHandle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private SavedStateHandle handle;
        private String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str, T t) {
            super(t);
            ckf.g(str, "key");
            this.key = str;
            this.handle = savedStateHandle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object ipc$super(SavingStateLiveData savingStateLiveData, String str, Object... objArr) {
            if (str.hashCode() == 1835267474) {
                super.setValue(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/SavedStateHandle$SavingStateLiveData");
        }

        public final void detach() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
            } else {
                this.handle = null;
            }
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d63f592", new Object[]{this, t});
                return;
            }
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null) {
                SavedStateHandle.access$getRegular$p(savedStateHandle).put(this.key, t);
                hfj hfjVar = (hfj) SavedStateHandle.access$getFlows$p(savedStateHandle).get(this.key);
                if (hfjVar != null) {
                    hfjVar.setValue(t);
                }
            }
            super.setValue(t);
        }

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str) {
            ckf.g(str, "key");
            this.key = str;
            this.handle = savedStateHandle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandle savedStateHandle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("4ec44e25", new Object[]{savedStateHandle});
        }
        ckf.g(savedStateHandle, "this$0");
        for (Map.Entry entry : a.r(savedStateHandle.savedStateProviders).entrySet()) {
            savedStateHandle.set((String) entry.getKey(), ((SavedStateRegistry.SavedStateProvider) entry.getValue()).saveState());
        }
        Set<String> keySet = savedStateHandle.regular.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(savedStateHandle.regular.get(str));
        }
        return BundleKt.bundleOf(jpu.a("keys", arrayList), jpu.a("values", arrayList2));
    }

    public SavedStateHandle() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: tb.ero
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle savedStateProvider$lambda$0;
                savedStateProvider$lambda$0 = SavedStateHandle.savedStateProvider$lambda$0(SavedStateHandle.this);
                return savedStateProvider$lambda$0;
            }
        };
    }
}
