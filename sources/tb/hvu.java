package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.UINodeType;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hvu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_POOL_SIZE = 3;
    private Object mountContent;
    public boolean mounted;
    private final int typeId;
    private static final Map<Object, Integer> sTypeIdByNodeType = new HashMap();
    private static final AtomicInteger sNodeTypeId = new AtomicInteger();

    static {
        t2o.a(986710092);
    }

    public hvu(Object obj) {
        obj = obj == null ? getClass() : obj;
        Map<Object, Integer> map = sTypeIdByNodeType;
        synchronized (map) {
            try {
                if (!map.containsKey(obj)) {
                    map.put(obj, Integer.valueOf(sNodeTypeId.incrementAndGet()));
                }
                this.typeId = map.get(obj).intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void activityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d692ed2e", new Object[]{this});
        } else {
            onActivityPause();
        }
    }

    public void activityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e029f6a3", new Object[]{this});
        } else {
            onActivityResume();
        }
    }

    public boolean canPreallocate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad6217b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public Object createMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2275846d", new Object[]{this, context});
        }
        return onCreateMountContent(context);
    }

    public void dispatchPreallocate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559580db", new Object[]{this, context});
        }
    }

    public final <T> T getMountContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1c1e26b5", new Object[]{this});
        }
        return (T) this.mountContent;
    }

    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.NONE;
    }

    public int getTypeId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8761ebe5", new Object[]{this})).intValue();
        }
        return this.typeId;
    }

    public boolean isMounted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d77cb79", new Object[]{this})).booleanValue();
        }
        return this.mounted;
    }

    public void mount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197ec32", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        this.mounted = true;
        try {
            this.mountContent = obj;
            onMount(mUSDKInstance, obj);
        } catch (Exception e) {
            wvh.a().b("UINodeLifeCycle.mount", e);
            dwh.i(e);
        }
    }

    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        }
    }

    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        }
    }

    public void onBoundsChange(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb13740b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        throw new RuntimeException("Trying to mount a view or drawable node that doesn't implement //@OnCreateMountContent");
    }

    public l1j onCreateMountContentPool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l1j) ipChange.ipc$dispatch("d315b202", new Object[]{this});
        }
        return new a47(getClass().getSimpleName(), poolSize(), true);
    }

    public void onMeasure(int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab21ed4", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr});
        }
    }

    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
        }
    }

    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        }
    }

    public int poolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
        }
        return 3;
    }

    public void preallocate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c599da41", new Object[]{this, context});
            return;
        }
        if (canPreallocate() && jvu.a(this)) {
            dd4.e(context, this);
        }
        dispatchPreallocate(context);
    }

    public void unmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ec954b", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        this.mounted = false;
        try {
            this.mountContent = null;
            onUnmount(mUSDKInstance, obj);
        } catch (Exception e) {
            wvh.a().b("UINodeLifeCycle.unmount", e);
            dwh.i(e);
        }
    }

    public void measure(int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5e52f3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr});
        } else if (iArr == null || iArr.length < 2) {
            throw new IllegalArgumentException("output's length must >= 2");
        } else {
            iArr[0] = -1;
            iArr[1] = -1;
            onMeasure(i, i2, i3, i4, iArr);
            if (iArr[0] == -1 || iArr[1] == -1) {
                throw new IllegalStateException("onMeasure must apply width and height to output");
            }
        }
    }
}
