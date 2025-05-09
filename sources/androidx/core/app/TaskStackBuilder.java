package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TaskStackBuilder implements Iterable<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TaskStackBuilder";
    private final ArrayList<Intent> mIntents = new ArrayList<>();
    private final Context mSourceContext;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface SupportParentable {
        Intent getSupportParentActivityIntent();
    }

    private TaskStackBuilder(Context context) {
        this.mSourceContext = context;
    }

    public static TaskStackBuilder create(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskStackBuilder) ipChange.ipc$dispatch("ed155c90", new Object[]{context});
        }
        return new TaskStackBuilder(context);
    }

    @Deprecated
    public static TaskStackBuilder from(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskStackBuilder) ipChange.ipc$dispatch("753633e", new Object[]{context});
        }
        return create(context);
    }

    public TaskStackBuilder addNextIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskStackBuilder) ipChange.ipc$dispatch("7058fda1", new Object[]{this, intent});
        }
        this.mIntents.add(intent);
        return this;
    }

    public TaskStackBuilder addNextIntentWithParentStack(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskStackBuilder) ipChange.ipc$dispatch("d68cb49", new Object[]{this, intent});
        }
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.mSourceContext.getPackageManager());
        }
        if (component != null) {
            addParentStack(component);
        }
        addNextIntent(intent);
        return this;
    }

    public TaskStackBuilder addParentStack(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskStackBuilder) ipChange.ipc$dispatch("5e22599f", new Object[]{this, activity});
        }
        Intent supportParentActivityIntent = activity instanceof SupportParentable ? ((SupportParentable) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = NavUtils.getParentActivityIntent(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.mSourceContext.getPackageManager());
            }
            addParentStack(component);
            addNextIntent(supportParentActivityIntent);
        }
        return this;
    }

    public Intent editIntentAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("313d36d0", new Object[]{this, new Integer(i)});
        }
        return this.mIntents.get(i);
    }

    @Deprecated
    public Intent getIntent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("c1bae0c9", new Object[]{this, new Integer(i)});
        }
        return editIntentAt(i);
    }

    public int getIntentCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ca02097", new Object[]{this})).intValue();
        }
        return this.mIntents.size();
    }

    public Intent[] getIntents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent[]) ipChange.ipc$dispatch("46f62a2a", new Object[]{this});
        }
        int size = this.mIntents.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.mIntents.get(0)).addFlags(268484608);
        for (int i = 1; i < size; i++) {
            intentArr[i] = new Intent(this.mIntents.get(i));
        }
        return intentArr;
    }

    public PendingIntent getPendingIntent(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PendingIntent) ipChange.ipc$dispatch("a4460d30", new Object[]{this, new Integer(i), new Integer(i2)}) : getPendingIntent(i, i2, null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        return this.mIntents.iterator();
    }

    public void startActivities() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d03ef6", new Object[]{this});
        } else {
            startActivities(null);
        }
    }

    public PendingIntent getPendingIntent(int i, int i2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("44b46afc", new Object[]{this, new Integer(i), new Integer(i2), bundle});
        }
        if (!this.mIntents.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.mIntents.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return ya.b(this.mSourceContext, i, intentArr, i2, bundle);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    public void startActivities(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fc2661e", new Object[]{this, bundle});
        } else if (!this.mIntents.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.mIntents.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!ContextCompat.startActivities(this.mSourceContext, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.mSourceContext.startActivity(intent);
            }
        } else {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
    }

    public TaskStackBuilder addParentStack(Class<?> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaskStackBuilder) ipChange.ipc$dispatch("a54d049c", new Object[]{this, cls}) : addParentStack(new ComponentName(this.mSourceContext, cls));
    }

    public TaskStackBuilder addParentStack(ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskStackBuilder) ipChange.ipc$dispatch("b7d9392a", new Object[]{this, componentName});
        }
        int size = this.mIntents.size();
        try {
            Intent parentActivityIntent = NavUtils.getParentActivityIntent(this.mSourceContext, componentName);
            while (parentActivityIntent != null) {
                this.mIntents.add(size, parentActivityIntent);
                parentActivityIntent = NavUtils.getParentActivityIntent(this.mSourceContext, parentActivityIntent.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }
}
