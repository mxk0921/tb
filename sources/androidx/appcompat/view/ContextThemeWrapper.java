package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ContextThemeWrapper extends ContextWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Configuration sEmptyConfig;
    private LayoutInflater mInflater;
    private Configuration mOverrideConfiguration;
    private Resources mResources;
    private Resources.Theme mTheme;
    private int mThemeResource;

    public ContextThemeWrapper() {
        super(null);
    }

    private Resources getResourcesInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("6c7017a4", new Object[]{this});
        }
        if (this.mResources == null) {
            Configuration configuration = this.mOverrideConfiguration;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && isEmptyConfiguration(configuration))) {
                this.mResources = super.getResources();
            } else {
                this.mResources = createConfigurationContext(this.mOverrideConfiguration).getResources();
            }
        }
        return this.mResources;
    }

    private void initializeTheme() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e14420", new Object[]{this});
            return;
        }
        if (this.mTheme == null) {
            z = true;
        }
        if (z) {
            this.mTheme = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.mTheme.setTo(theme);
            }
        }
        onApplyThemeResource(this.mTheme, this.mThemeResource, z);
    }

    public static /* synthetic */ Object ipc$super(ContextThemeWrapper contextThemeWrapper, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode == 922616583) {
            return super.getResources();
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/appcompat/view/ContextThemeWrapper");
        }
    }

    private static boolean isEmptyConfiguration(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d2e6d3a", new Object[]{configuration})).booleanValue();
        }
        if (configuration == null) {
            return true;
        }
        if (sEmptyConfig == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            sEmptyConfig = configuration2;
        }
        return configuration.equals(sEmptyConfig);
    }

    public void applyOverrideConfiguration(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ccf62cd", new Object[]{this, configuration});
        } else if (this.mResources != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.mOverrideConfiguration == null) {
            this.mOverrideConfiguration = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
        } else {
            super.attachBaseContext(context);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AssetManager) ipChange.ipc$dispatch("7b0fb283", new Object[]{this});
        }
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("36fe0307", new Object[]{this});
        }
        return getResourcesInternal();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5c99a0f1", new Object[]{this, str});
        }
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.mInflater == null) {
            this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.mInflater;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources.Theme) ipChange.ipc$dispatch("7642b746", new Object[]{this});
        }
        Resources.Theme theme = this.mTheme;
        if (theme != null) {
            return theme;
        }
        if (this.mThemeResource == 0) {
            this.mThemeResource = R.style.Theme_AppCompat_Light;
        }
        initializeTheme();
        return this.mTheme;
    }

    public int getThemeResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb192202", new Object[]{this})).intValue();
        }
        return this.mThemeResource;
    }

    public void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f8bdde", new Object[]{this, theme, new Integer(i), new Boolean(z)});
        } else {
            theme.applyStyle(i, true);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4c4535", new Object[]{this, new Integer(i)});
        } else if (this.mThemeResource != i) {
            this.mThemeResource = i;
            initializeTheme();
        }
    }

    public ContextThemeWrapper(Context context, int i) {
        super(context);
        this.mThemeResource = i;
    }

    public ContextThemeWrapper(Context context, Resources.Theme theme) {
        super(context);
        this.mTheme = theme;
    }
}
