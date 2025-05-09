package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ActivityChooserModel extends DataSetObservable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTRIBUTE_ACTIVITY = "activity";
    public static final String ATTRIBUTE_TIME = "time";
    public static final String ATTRIBUTE_WEIGHT = "weight";
    public static final boolean DEBUG = false;
    private static final int DEFAULT_ACTIVITY_INFLATION = 5;
    private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1.0f;
    public static final String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
    public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
    private static final String HISTORY_FILE_EXTENSION = ".xml";
    private static final int INVALID_INDEX = -1;
    public static final String LOG_TAG = "ActivityChooserModel";
    public static final String TAG_HISTORICAL_RECORD = "historical-record";
    public static final String TAG_HISTORICAL_RECORDS = "historical-records";
    private OnChooseActivityListener mActivityChoserModelPolicy;
    public final Context mContext;
    public final String mHistoryFileName;
    private Intent mIntent;
    private static final Object sRegistryLock = new Object();
    private static final Map<String, ActivityChooserModel> sDataModelRegistry = new HashMap();
    private final Object mInstanceLock = new Object();
    private final List<ActivityResolveInfo> mActivities = new ArrayList();
    private final List<HistoricalRecord> mHistoricalRecords = new ArrayList();
    private ActivitySorter mActivitySorter = new DefaultSorter();
    private int mHistoryMaxSize = 50;
    public boolean mCanReadHistoricalData = true;
    private boolean mReadShareHistoryCalled = false;
    private boolean mHistoricalRecordsChanged = true;
    private boolean mReloadActivities = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface ActivityChooserModelClient {
        void setActivityChooserModel(ActivityChooserModel activityChooserModel);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final ResolveInfo resolveInfo;
        public float weight;

        public ActivityResolveInfo(ResolveInfo resolveInfo) {
            this.resolveInfo = resolveInfo;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj != null && ActivityResolveInfo.class == obj.getClass() && Float.floatToIntBits(this.weight) == Float.floatToIntBits(((ActivityResolveInfo) obj).weight)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return Float.floatToIntBits(this.weight) + 31;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "[resolveInfo:" + this.resolveInfo.toString() + "; weight:" + new BigDecimal(this.weight) + "]";
        }

        public int compareTo(ActivityResolveInfo activityResolveInfo) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d0f46b4c", new Object[]{this, activityResolveInfo})).intValue() : Float.floatToIntBits(activityResolveInfo.weight) - Float.floatToIntBits(this.weight);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface ActivitySorter {
        void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class DefaultSorter implements ActivitySorter {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final float WEIGHT_DECAY_COEFFICIENT = 0.95f;
        private final Map<ComponentName, ActivityResolveInfo> mPackageNameToActivityMap = new HashMap();

        @Override // androidx.appcompat.widget.ActivityChooserModel.ActivitySorter
        public void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96c833c4", new Object[]{this, intent, list, list2});
                return;
            }
            Map<ComponentName, ActivityResolveInfo> map = this.mPackageNameToActivityMap;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ActivityResolveInfo activityResolveInfo = list.get(i);
                activityResolveInfo.weight = 0.0f;
                ActivityInfo activityInfo = activityResolveInfo.resolveInfo.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), activityResolveInfo);
            }
            float f = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                HistoricalRecord historicalRecord = list2.get(size2);
                ActivityResolveInfo activityResolveInfo2 = map.get(historicalRecord.activity);
                if (activityResolveInfo2 != null) {
                    activityResolveInfo2.weight += historicalRecord.weight * f;
                    f *= WEIGHT_DECAY_COEFFICIENT;
                }
            }
            Collections.sort(list);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class HistoricalRecord {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final ComponentName activity;
        public final long time;
        public final float weight;

        public HistoricalRecord(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || HistoricalRecord.class != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            ComponentName componentName = this.activity;
            if (componentName == null) {
                if (historicalRecord.activity != null) {
                    return false;
                }
            } else if (!componentName.equals(historicalRecord.activity)) {
                return false;
            }
            if (this.time == historicalRecord.time && Float.floatToIntBits(this.weight) == Float.floatToIntBits(historicalRecord.weight)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            ComponentName componentName = this.activity;
            if (componentName != null) {
                i = componentName.hashCode();
            }
            long j = this.time;
            return ((((i + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.weight);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "[; activity:" + this.activity + "; time:" + this.time + "; weight:" + new BigDecimal(this.weight) + "]";
        }

        public HistoricalRecord(ComponentName componentName, long j, float f) {
            this.activity = componentName;
            this.time = j;
            this.weight = f;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnChooseActivityListener {
        boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class PersistHistoryAsyncTask extends AsyncTask<Object, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public PersistHistoryAsyncTask() {
        }

        public static /* synthetic */ Object ipc$super(PersistHistoryAsyncTask persistHistoryAsyncTask, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask");
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
            if (r15 != null) goto L_0x008f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
            r15.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
            if (r15 == null) goto L_0x00f0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
            if (r15 == null) goto L_0x00f0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ed, code lost:
            if (r15 == null) goto L_0x00f0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00f0, code lost:
            return null;
         */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserModel.PersistHistoryAsyncTask.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    private ActivityChooserModel(Context context, String str) {
        this.mContext = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(HISTORY_FILE_EXTENSION)) {
            this.mHistoryFileName = str;
        } else {
            this.mHistoryFileName = str.concat(HISTORY_FILE_EXTENSION);
        }
    }

    private boolean addHistoricalRecord(HistoricalRecord historicalRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1437a559", new Object[]{this, historicalRecord})).booleanValue();
        }
        boolean add = this.mHistoricalRecords.add(historicalRecord);
        if (add) {
            this.mHistoricalRecordsChanged = true;
            pruneExcessiveHistoricalRecordsIfNeeded();
            persistHistoricalDataIfNeeded();
            sortActivitiesIfNeeded();
            notifyChanged();
        }
        return add;
    }

    private void ensureConsistentState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f20a108", new Object[]{this});
            return;
        }
        boolean loadActivitiesIfNeeded = loadActivitiesIfNeeded() | readHistoricalDataIfNeeded();
        pruneExcessiveHistoricalRecordsIfNeeded();
        if (loadActivitiesIfNeeded) {
            sortActivitiesIfNeeded();
            notifyChanged();
        }
    }

    public static ActivityChooserModel get(Context context, String str) {
        ActivityChooserModel activityChooserModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityChooserModel) ipChange.ipc$dispatch("fc10e77a", new Object[]{context, str});
        }
        synchronized (sRegistryLock) {
            try {
                Map<String, ActivityChooserModel> map = sDataModelRegistry;
                activityChooserModel = map.get(str);
                if (activityChooserModel == null) {
                    activityChooserModel = new ActivityChooserModel(context, str);
                    map.put(str, activityChooserModel);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return activityChooserModel;
    }

    public static /* synthetic */ Object ipc$super(ActivityChooserModel activityChooserModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/ActivityChooserModel");
    }

    private boolean loadActivitiesIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b52587d0", new Object[]{this})).booleanValue();
        }
        if (!this.mReloadActivities || this.mIntent == null) {
            return false;
        }
        this.mReloadActivities = false;
        this.mActivities.clear();
        List<ResolveInfo> queryIntentActivities = this.mContext.getPackageManager().queryIntentActivities(this.mIntent, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.mActivities.add(new ActivityResolveInfo(queryIntentActivities.get(i)));
        }
        return true;
    }

    private void persistHistoricalDataIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("855ae961", new Object[]{this});
        } else if (!this.mReadShareHistoryCalled) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.mHistoricalRecordsChanged) {
            this.mHistoricalRecordsChanged = false;
            if (!TextUtils.isEmpty(this.mHistoryFileName)) {
                new PersistHistoryAsyncTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.mHistoricalRecords), this.mHistoryFileName);
            }
        }
    }

    private void pruneExcessiveHistoricalRecordsIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649898b8", new Object[]{this});
            return;
        }
        int size = this.mHistoricalRecords.size() - this.mHistoryMaxSize;
        if (size > 0) {
            this.mHistoricalRecordsChanged = true;
            for (int i = 0; i < size; i++) {
                this.mHistoricalRecords.remove(0);
            }
        }
    }

    private boolean readHistoricalDataIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42967aa7", new Object[]{this})).booleanValue();
        }
        if (!this.mCanReadHistoricalData || !this.mHistoricalRecordsChanged || TextUtils.isEmpty(this.mHistoryFileName)) {
            return false;
        }
        this.mCanReadHistoricalData = false;
        this.mReadShareHistoryCalled = true;
        readHistoricalDataImpl();
        return true;
    }

    private boolean sortActivitiesIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("214ade88", new Object[]{this})).booleanValue();
        }
        if (this.mActivitySorter == null || this.mIntent == null || this.mActivities.isEmpty() || this.mHistoricalRecords.isEmpty()) {
            return false;
        }
        this.mActivitySorter.sort(this.mIntent, this.mActivities, Collections.unmodifiableList(this.mHistoricalRecords));
        return true;
    }

    public Intent chooseActivity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("1598f77d", new Object[]{this, new Integer(i)});
        }
        synchronized (this.mInstanceLock) {
            try {
                if (this.mIntent == null) {
                    return null;
                }
                ensureConsistentState();
                ActivityInfo activityInfo = this.mActivities.get(i).resolveInfo.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.mIntent);
                intent.setComponent(componentName);
                if (this.mActivityChoserModelPolicy != null && this.mActivityChoserModelPolicy.onChooseActivity(this, new Intent(intent))) {
                    return null;
                }
                addHistoricalRecord(new HistoricalRecord(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResolveInfo getActivity(int i) {
        ResolveInfo resolveInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResolveInfo) ipChange.ipc$dispatch("1c20c8f0", new Object[]{this, new Integer(i)});
        }
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            resolveInfo = this.mActivities.get(i).resolveInfo;
        }
        return resolveInfo;
    }

    public int getActivityCount() {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48e96b04", new Object[]{this})).intValue();
        }
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            size = this.mActivities.size();
        }
        return size;
    }

    public int getActivityIndex(ResolveInfo resolveInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a4c7bb8", new Object[]{this, resolveInfo})).intValue();
        }
        synchronized (this.mInstanceLock) {
            try {
                ensureConsistentState();
                List<ActivityResolveInfo> list = this.mActivities;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (list.get(i).resolveInfo == resolveInfo) {
                        return i;
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResolveInfo getDefaultActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResolveInfo) ipChange.ipc$dispatch("68afa3e6", new Object[]{this});
        }
        synchronized (this.mInstanceLock) {
            try {
                ensureConsistentState();
                if (this.mActivities.isEmpty()) {
                    return null;
                }
                return this.mActivities.get(0).resolveInfo;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getHistoryMaxSize() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7af2241", new Object[]{this})).intValue();
        }
        synchronized (this.mInstanceLock) {
            i = this.mHistoryMaxSize;
        }
        return i;
    }

    public int getHistorySize() {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d51c279", new Object[]{this})).intValue();
        }
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            size = this.mHistoricalRecords.size();
        }
        return size;
    }

    public Intent getIntent() {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this});
        }
        synchronized (this.mInstanceLock) {
            intent = this.mIntent;
        }
        return intent;
    }

    public void setActivitySorter(ActivitySorter activitySorter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd56eb6", new Object[]{this, activitySorter});
            return;
        }
        synchronized (this.mInstanceLock) {
            try {
                if (this.mActivitySorter != activitySorter) {
                    this.mActivitySorter = activitySorter;
                    if (sortActivitiesIfNeeded()) {
                        notifyChanged();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setHistoryMaxSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7a59e9", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this.mInstanceLock) {
            try {
                if (this.mHistoryMaxSize != i) {
                    this.mHistoryMaxSize = i;
                    pruneExcessiveHistoricalRecordsIfNeeded();
                    if (sortActivitiesIfNeeded()) {
                        notifyChanged();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setOnChooseActivityListener(OnChooseActivityListener onChooseActivityListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f502f8", new Object[]{this, onChooseActivityListener});
            return;
        }
        synchronized (this.mInstanceLock) {
            this.mActivityChoserModelPolicy = onChooseActivityListener;
        }
    }

    public void setDefaultActivity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ce546e", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this.mInstanceLock) {
            try {
                ensureConsistentState();
                ActivityResolveInfo activityResolveInfo = this.mActivities.get(i);
                ActivityResolveInfo activityResolveInfo2 = this.mActivities.get(0);
                float f = activityResolveInfo2 != null ? (activityResolveInfo2.weight - activityResolveInfo.weight) + 5.0f : 1.0f;
                ActivityInfo activityInfo = activityResolveInfo.resolveInfo.activityInfo;
                addHistoricalRecord(new HistoricalRecord(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f524bbe2", new Object[]{this, intent});
            return;
        }
        synchronized (this.mInstanceLock) {
            try {
                if (this.mIntent != intent) {
                    this.mIntent = intent;
                    this.mReloadActivities = true;
                    ensureConsistentState();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.android.alibaba.ip.runtime.IpChange, java.io.FileInputStream] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void readHistoricalDataImpl() {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "Error reading historical recrod file: "
            com.android.alibaba.ip.runtime.IpChange r3 = androidx.appcompat.widget.ActivityChooserModel.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0014
            java.lang.String r2 = "90618391"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r10
            r3.ipc$dispatch(r2, r1)
            return
        L_0x0014:
            android.content.Context r3 = r10.mContext     // Catch: FileNotFoundException -> 0x00d9
            java.lang.String r4 = r10.mHistoryFileName     // Catch: FileNotFoundException -> 0x00d9
            java.io.FileInputStream r3 = r3.openFileInput(r4)     // Catch: FileNotFoundException -> 0x00d9
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
        L_0x0025:
            if (r0 == r1) goto L_0x0037
            r5 = 2
            if (r0 == r5) goto L_0x0037
            int r0 = r4.next()     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            goto L_0x0025
        L_0x002f:
            r0 = move-exception
            goto L_0x00d3
        L_0x0032:
            r0 = move-exception
            goto L_0x00a0
        L_0x0034:
            r0 = move-exception
            goto L_0x00b9
        L_0x0037:
            java.lang.String r0 = "historical-records"
            java.lang.String r5 = r4.getName()     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            boolean r0 = r0.equals(r5)     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            if (r0 == 0) goto L_0x0098
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r0 = r10.mHistoricalRecords     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            r0.clear()     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
        L_0x0049:
            int r5 = r4.next()     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            if (r5 != r1) goto L_0x0056
            if (r3 == 0) goto L_0x00d2
        L_0x0051:
            r3.close()     // Catch: IOException -> 0x00d2
            goto L_0x00d2
        L_0x0056:
            r6 = 3
            if (r5 == r6) goto L_0x0049
            r6 = 4
            if (r5 != r6) goto L_0x005d
            goto L_0x0049
        L_0x005d:
            java.lang.String r5 = r4.getName()     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            java.lang.String r6 = "historical-record"
            boolean r5 = r6.equals(r5)     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            if (r5 == 0) goto L_0x0090
            java.lang.String r5 = "activity"
            r6 = 0
            java.lang.String r5 = r4.getAttributeValue(r6, r5)     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            java.lang.String r7 = "time"
            java.lang.String r7 = r4.getAttributeValue(r6, r7)     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            long r7 = java.lang.Long.parseLong(r7)     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            java.lang.String r9 = "weight"
            java.lang.String r6 = r4.getAttributeValue(r6, r9)     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r9 = new androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            r9.<init>(r5, r7, r6)     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            r0.add(r9)     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            goto L_0x0049
        L_0x0090:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            java.lang.String r1 = "Share records file not well-formed."
            r0.<init>(r1)     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            throw r0     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
        L_0x0098:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            java.lang.String r1 = "Share records file does not start with historical-records tag."
            r0.<init>(r1)     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
            throw r0     // Catch: all -> 0x002f, IOException -> 0x0032, XmlPullParserException -> 0x0034
        L_0x00a0:
            java.lang.String r1 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG     // Catch: all -> 0x002f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x002f
            r4.<init>()     // Catch: all -> 0x002f
            r4.append(r2)     // Catch: all -> 0x002f
            java.lang.String r2 = r10.mHistoryFileName     // Catch: all -> 0x002f
            r4.append(r2)     // Catch: all -> 0x002f
            java.lang.String r2 = r4.toString()     // Catch: all -> 0x002f
            android.util.Log.e(r1, r2, r0)     // Catch: all -> 0x002f
            if (r3 == 0) goto L_0x00d2
            goto L_0x0051
        L_0x00b9:
            java.lang.String r1 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG     // Catch: all -> 0x002f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x002f
            r4.<init>()     // Catch: all -> 0x002f
            r4.append(r2)     // Catch: all -> 0x002f
            java.lang.String r2 = r10.mHistoryFileName     // Catch: all -> 0x002f
            r4.append(r2)     // Catch: all -> 0x002f
            java.lang.String r2 = r4.toString()     // Catch: all -> 0x002f
            android.util.Log.e(r1, r2, r0)     // Catch: all -> 0x002f
            if (r3 == 0) goto L_0x00d2
            goto L_0x0051
        L_0x00d2:
            return
        L_0x00d3:
            if (r3 == 0) goto L_0x00d8
            r3.close()     // Catch: IOException -> 0x00d8
        L_0x00d8:
            throw r0
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserModel.readHistoricalDataImpl():void");
    }
}
