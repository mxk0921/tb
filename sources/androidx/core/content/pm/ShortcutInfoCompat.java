package androidx.core.content.pm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.collection.ArraySet;
import androidx.core.app.Person;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.net.UriCompat;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.gsp;
import tb.psp;
import tb.qsp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ShortcutInfoCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EXTRA_LOCUS_ID = "extraLocusId";
    private static final String EXTRA_LONG_LIVED = "extraLongLived";
    private static final String EXTRA_PERSON_ = "extraPerson_";
    private static final String EXTRA_PERSON_COUNT = "extraPersonCount";
    private static final String EXTRA_SLICE_URI = "extraSliceUri";
    public static final int SURFACE_LAUNCHER = 1;
    public ComponentName mActivity;
    public Set<String> mCategories;
    public Context mContext;
    public CharSequence mDisabledMessage;
    public int mDisabledReason;
    public int mExcludedSurfaces;
    public PersistableBundle mExtras;
    public boolean mHasKeyFieldsOnly;
    public IconCompat mIcon;
    public String mId;
    public Intent[] mIntents;
    public boolean mIsAlwaysBadged;
    public boolean mIsCached;
    public boolean mIsDeclaredInManifest;
    public boolean mIsDynamic;
    public boolean mIsEnabled = true;
    public boolean mIsImmutable;
    public boolean mIsLongLived;
    public boolean mIsPinned;
    public CharSequence mLabel;
    public long mLastChangedTimestamp;
    public LocusIdCompat mLocusId;
    public CharSequence mLongLabel;
    public String mPackageName;
    public Person[] mPersons;
    public int mRank;
    public Bundle mTransientExtras;
    public UserHandle mUser;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api33Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api33Impl() {
        }

        public static void setExcludedFromSurfaces(ShortcutInfo.Builder builder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92743bec", new Object[]{builder, new Integer(i)});
            } else {
                builder.setExcludedFromSurfaces(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, Map<String, List<String>>> mCapabilityBindingParams;
        private Set<String> mCapabilityBindings;
        private final ShortcutInfoCompat mInfo;
        private boolean mIsConversation;
        private Uri mSliceUri;

        public Builder(Context context, String str) {
            ShortcutInfoCompat shortcutInfoCompat = new ShortcutInfoCompat();
            this.mInfo = shortcutInfoCompat;
            shortcutInfoCompat.mContext = context;
            shortcutInfoCompat.mId = str;
        }

        public Builder addCapabilityBinding(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("37239a6f", new Object[]{this, str});
            }
            if (this.mCapabilityBindings == null) {
                this.mCapabilityBindings = new HashSet();
            }
            this.mCapabilityBindings.add(str);
            return this;
        }

        public Builder setActivity(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2a75fa09", new Object[]{this, componentName});
            }
            this.mInfo.mActivity = componentName;
            return this;
        }

        public Builder setAlwaysBadged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("624f484b", new Object[]{this});
            }
            this.mInfo.mIsAlwaysBadged = true;
            return this;
        }

        public Builder setCategories(Set<String> set) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d9092f2c", new Object[]{this, set});
            }
            ArraySet arraySet = new ArraySet();
            arraySet.addAll(set);
            this.mInfo.mCategories = arraySet;
            return this;
        }

        public Builder setDisabledMessage(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6a300986", new Object[]{this, charSequence});
            }
            this.mInfo.mDisabledMessage = charSequence;
            return this;
        }

        public Builder setExcludedFromSurfaces(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("673590f2", new Object[]{this, new Integer(i)});
            }
            this.mInfo.mExcludedSurfaces = i;
            return this;
        }

        public Builder setExtras(PersistableBundle persistableBundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("723b8808", new Object[]{this, persistableBundle});
            }
            this.mInfo.mExtras = persistableBundle;
            return this;
        }

        public Builder setIcon(IconCompat iconCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("94add51", new Object[]{this, iconCompat});
            }
            this.mInfo.mIcon = iconCompat;
            return this;
        }

        public Builder setIntent(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9a931894", new Object[]{this, intent});
            }
            return setIntents(new Intent[]{intent});
        }

        public Builder setIntents(Intent[] intentArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5e61f8e8", new Object[]{this, intentArr});
            }
            this.mInfo.mIntents = intentArr;
            return this;
        }

        public Builder setIsConversation() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("661d9388", new Object[]{this});
            }
            this.mIsConversation = true;
            return this;
        }

        public Builder setLocusId(LocusIdCompat locusIdCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f1cebf3a", new Object[]{this, locusIdCompat});
            }
            this.mInfo.mLocusId = locusIdCompat;
            return this;
        }

        public Builder setLongLabel(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("eb6309f3", new Object[]{this, charSequence});
            }
            this.mInfo.mLongLabel = charSequence;
            return this;
        }

        @Deprecated
        public Builder setLongLived() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a24853", new Object[]{this});
            }
            this.mInfo.mIsLongLived = true;
            return this;
        }

        public Builder setPerson(Person person) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2e3bc2f2", new Object[]{this, person});
            }
            return setPersons(new Person[]{person});
        }

        public Builder setPersons(Person[] personArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2065a406", new Object[]{this, personArr});
            }
            this.mInfo.mPersons = personArr;
            return this;
        }

        public Builder setRank(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1c098f20", new Object[]{this, new Integer(i)});
            }
            this.mInfo.mRank = i;
            return this;
        }

        public Builder setShortLabel(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("49d9b837", new Object[]{this, charSequence});
            }
            this.mInfo.mLabel = charSequence;
            return this;
        }

        public Builder setSliceUri(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5e7637d6", new Object[]{this, uri});
            }
            this.mSliceUri = uri;
            return this;
        }

        public Builder setTransientExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("27548c74", new Object[]{this, bundle});
            }
            this.mInfo.mTransientExtras = (Bundle) Preconditions.checkNotNull(bundle);
            return this;
        }

        public Builder setLongLived(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("dcf29005", new Object[]{this, new Boolean(z)});
            }
            this.mInfo.mIsLongLived = z;
            return this;
        }

        public ShortcutInfoCompat build() {
            String[] strArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShortcutInfoCompat) ipChange.ipc$dispatch("c3fa7c1e", new Object[]{this});
            }
            if (!TextUtils.isEmpty(this.mInfo.mLabel)) {
                ShortcutInfoCompat shortcutInfoCompat = this.mInfo;
                Intent[] intentArr = shortcutInfoCompat.mIntents;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                if (this.mIsConversation) {
                    if (shortcutInfoCompat.mLocusId == null) {
                        shortcutInfoCompat.mLocusId = new LocusIdCompat(shortcutInfoCompat.mId);
                    }
                    this.mInfo.mIsLongLived = true;
                }
                if (this.mCapabilityBindings != null) {
                    ShortcutInfoCompat shortcutInfoCompat2 = this.mInfo;
                    if (shortcutInfoCompat2.mCategories == null) {
                        shortcutInfoCompat2.mCategories = new HashSet();
                    }
                    this.mInfo.mCategories.addAll(this.mCapabilityBindings);
                }
                if (this.mCapabilityBindingParams != null) {
                    ShortcutInfoCompat shortcutInfoCompat3 = this.mInfo;
                    if (shortcutInfoCompat3.mExtras == null) {
                        shortcutInfoCompat3.mExtras = new PersistableBundle();
                    }
                    for (String str : this.mCapabilityBindingParams.keySet()) {
                        Map<String, List<String>> map = this.mCapabilityBindingParams.get(str);
                        this.mInfo.mExtras.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                        for (String str2 : map.keySet()) {
                            List<String> list = map.get(str2);
                            PersistableBundle persistableBundle = this.mInfo.mExtras;
                            String str3 = str + "/" + str2;
                            if (list == null) {
                                strArr = new String[0];
                            } else {
                                strArr = (String[]) list.toArray(new String[0]);
                            }
                            persistableBundle.putStringArray(str3, strArr);
                        }
                    }
                }
                if (this.mSliceUri != null) {
                    ShortcutInfoCompat shortcutInfoCompat4 = this.mInfo;
                    if (shortcutInfoCompat4.mExtras == null) {
                        shortcutInfoCompat4.mExtras = new PersistableBundle();
                    }
                    this.mInfo.mExtras.putString(ShortcutInfoCompat.EXTRA_SLICE_URI, UriCompat.toSafeString(this.mSliceUri));
                }
                return this.mInfo;
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        public Builder addCapabilityBinding(String str, String str2, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("556ab66a", new Object[]{this, str, str2, list});
            }
            addCapabilityBinding(str);
            if (!list.isEmpty()) {
                if (this.mCapabilityBindingParams == null) {
                    this.mCapabilityBindingParams = new HashMap();
                }
                if (this.mCapabilityBindingParams.get(str) == null) {
                    this.mCapabilityBindingParams.put(str, new HashMap());
                }
                this.mCapabilityBindingParams.get(str).put(str2, list);
            }
            return this;
        }

        public Builder(ShortcutInfoCompat shortcutInfoCompat) {
            ShortcutInfoCompat shortcutInfoCompat2 = new ShortcutInfoCompat();
            this.mInfo = shortcutInfoCompat2;
            shortcutInfoCompat2.mContext = shortcutInfoCompat.mContext;
            shortcutInfoCompat2.mId = shortcutInfoCompat.mId;
            shortcutInfoCompat2.mPackageName = shortcutInfoCompat.mPackageName;
            Intent[] intentArr = shortcutInfoCompat.mIntents;
            shortcutInfoCompat2.mIntents = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            shortcutInfoCompat2.mActivity = shortcutInfoCompat.mActivity;
            shortcutInfoCompat2.mLabel = shortcutInfoCompat.mLabel;
            shortcutInfoCompat2.mLongLabel = shortcutInfoCompat.mLongLabel;
            shortcutInfoCompat2.mDisabledMessage = shortcutInfoCompat.mDisabledMessage;
            shortcutInfoCompat2.mDisabledReason = shortcutInfoCompat.mDisabledReason;
            shortcutInfoCompat2.mIcon = shortcutInfoCompat.mIcon;
            shortcutInfoCompat2.mIsAlwaysBadged = shortcutInfoCompat.mIsAlwaysBadged;
            shortcutInfoCompat2.mUser = shortcutInfoCompat.mUser;
            shortcutInfoCompat2.mLastChangedTimestamp = shortcutInfoCompat.mLastChangedTimestamp;
            shortcutInfoCompat2.mIsCached = shortcutInfoCompat.mIsCached;
            shortcutInfoCompat2.mIsDynamic = shortcutInfoCompat.mIsDynamic;
            shortcutInfoCompat2.mIsPinned = shortcutInfoCompat.mIsPinned;
            shortcutInfoCompat2.mIsDeclaredInManifest = shortcutInfoCompat.mIsDeclaredInManifest;
            shortcutInfoCompat2.mIsImmutable = shortcutInfoCompat.mIsImmutable;
            shortcutInfoCompat2.mIsEnabled = shortcutInfoCompat.mIsEnabled;
            shortcutInfoCompat2.mLocusId = shortcutInfoCompat.mLocusId;
            shortcutInfoCompat2.mIsLongLived = shortcutInfoCompat.mIsLongLived;
            shortcutInfoCompat2.mHasKeyFieldsOnly = shortcutInfoCompat.mHasKeyFieldsOnly;
            shortcutInfoCompat2.mRank = shortcutInfoCompat.mRank;
            Person[] personArr = shortcutInfoCompat.mPersons;
            if (personArr != null) {
                shortcutInfoCompat2.mPersons = (Person[]) Arrays.copyOf(personArr, personArr.length);
            }
            if (shortcutInfoCompat.mCategories != null) {
                shortcutInfoCompat2.mCategories = new HashSet(shortcutInfoCompat.mCategories);
            }
            PersistableBundle persistableBundle = shortcutInfoCompat.mExtras;
            if (persistableBundle != null) {
                shortcutInfoCompat2.mExtras = persistableBundle;
            }
            shortcutInfoCompat2.mExcludedSurfaces = shortcutInfoCompat.mExcludedSurfaces;
        }

        public Builder(Context context, ShortcutInfo shortcutInfo) {
            String id;
            String str;
            Intent[] intents;
            ComponentName activity;
            CharSequence shortLabel;
            CharSequence longLabel;
            CharSequence disabledMessage;
            Set<String> categories;
            PersistableBundle extras;
            UserHandle userHandle;
            long lastChangedTimestamp;
            boolean isDynamic;
            boolean isPinned;
            boolean isDeclaredInManifest;
            boolean isImmutable;
            boolean isEnabled;
            boolean hasKeyFieldsOnly;
            int rank;
            PersistableBundle extras2;
            boolean isCached;
            boolean isEnabled2;
            int disabledReason;
            ShortcutInfoCompat shortcutInfoCompat = new ShortcutInfoCompat();
            this.mInfo = shortcutInfoCompat;
            shortcutInfoCompat.mContext = context;
            id = shortcutInfo.getId();
            shortcutInfoCompat.mId = id;
            str = shortcutInfo.getPackage();
            shortcutInfoCompat.mPackageName = str;
            intents = shortcutInfo.getIntents();
            shortcutInfoCompat.mIntents = (Intent[]) Arrays.copyOf(intents, intents.length);
            activity = shortcutInfo.getActivity();
            shortcutInfoCompat.mActivity = activity;
            shortLabel = shortcutInfo.getShortLabel();
            shortcutInfoCompat.mLabel = shortLabel;
            longLabel = shortcutInfo.getLongLabel();
            shortcutInfoCompat.mLongLabel = longLabel;
            disabledMessage = shortcutInfo.getDisabledMessage();
            shortcutInfoCompat.mDisabledMessage = disabledMessage;
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                disabledReason = shortcutInfo.getDisabledReason();
                shortcutInfoCompat.mDisabledReason = disabledReason;
            } else {
                isEnabled2 = shortcutInfo.isEnabled();
                shortcutInfoCompat.mDisabledReason = isEnabled2 ? 0 : 3;
            }
            categories = shortcutInfo.getCategories();
            shortcutInfoCompat.mCategories = categories;
            extras = shortcutInfo.getExtras();
            shortcutInfoCompat.mPersons = ShortcutInfoCompat.getPersonsFromExtra(extras);
            userHandle = shortcutInfo.getUserHandle();
            shortcutInfoCompat.mUser = userHandle;
            lastChangedTimestamp = shortcutInfo.getLastChangedTimestamp();
            shortcutInfoCompat.mLastChangedTimestamp = lastChangedTimestamp;
            if (i >= 30) {
                isCached = shortcutInfo.isCached();
                shortcutInfoCompat.mIsCached = isCached;
            }
            isDynamic = shortcutInfo.isDynamic();
            shortcutInfoCompat.mIsDynamic = isDynamic;
            isPinned = shortcutInfo.isPinned();
            shortcutInfoCompat.mIsPinned = isPinned;
            isDeclaredInManifest = shortcutInfo.isDeclaredInManifest();
            shortcutInfoCompat.mIsDeclaredInManifest = isDeclaredInManifest;
            isImmutable = shortcutInfo.isImmutable();
            shortcutInfoCompat.mIsImmutable = isImmutable;
            isEnabled = shortcutInfo.isEnabled();
            shortcutInfoCompat.mIsEnabled = isEnabled;
            hasKeyFieldsOnly = shortcutInfo.hasKeyFieldsOnly();
            shortcutInfoCompat.mHasKeyFieldsOnly = hasKeyFieldsOnly;
            shortcutInfoCompat.mLocusId = ShortcutInfoCompat.getLocusId(shortcutInfo);
            rank = shortcutInfo.getRank();
            shortcutInfoCompat.mRank = rank;
            extras2 = shortcutInfo.getExtras();
            shortcutInfoCompat.mExtras = extras2;
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface Surface {
    }

    public static List<ShortcutInfoCompat> fromShortcuts(Context context, List<ShortcutInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9fe9a9d8", new Object[]{context, list});
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ShortcutInfo shortcutInfo : list) {
            arrayList.add(new Builder(context, gsp.a(shortcutInfo)).build());
        }
        return arrayList;
    }

    private static LocusIdCompat getLocusIdFromExtra(PersistableBundle persistableBundle) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocusIdCompat) ipChange.ipc$dispatch("3f5c08aa", new Object[]{persistableBundle});
        }
        if (persistableBundle == null || (string = persistableBundle.getString(EXTRA_LOCUS_ID)) == null) {
            return null;
        }
        return new LocusIdCompat(string);
    }

    public Intent addToIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("3d83c997", new Object[]{this, intent});
        }
        Intent[] intentArr = this.mIntents;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.mLabel.toString());
        if (this.mIcon != null) {
            Drawable drawable = null;
            if (this.mIsAlwaysBadged) {
                PackageManager packageManager = this.mContext.getPackageManager();
                ComponentName componentName = this.mActivity;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.mContext.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.mIcon.addToShortcutIntent(intent, drawable, this.mContext);
        }
        return intent;
    }

    public ComponentName getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentName) ipChange.ipc$dispatch("f06a132b", new Object[]{this});
        }
        return this.mActivity;
    }

    public Set<String> getCategories() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("3d47c5c8", new Object[]{this});
        }
        return this.mCategories;
    }

    public CharSequence getDisabledMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("9b7d267e", new Object[]{this});
        }
        return this.mDisabledMessage;
    }

    public int getDisabledReason() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d1ae250", new Object[]{this})).intValue();
        }
        return this.mDisabledReason;
    }

    public int getExcludedFromSurfaces() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1758270a", new Object[]{this})).intValue();
        }
        return this.mExcludedSurfaces;
    }

    public PersistableBundle getExtras() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PersistableBundle) ipChange.ipc$dispatch("7d6d83e0", new Object[]{this});
        }
        return this.mExtras;
    }

    public IconCompat getIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IconCompat) ipChange.ipc$dispatch("3d431b3d", new Object[]{this});
        }
        return this.mIcon;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.mId;
    }

    public Intent[] getIntents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent[]) ipChange.ipc$dispatch("46f62a2a", new Object[]{this});
        }
        Intent[] intentArr = this.mIntents;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    public long getLastChangedTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b143569", new Object[]{this})).longValue();
        }
        return this.mLastChangedTimestamp;
    }

    public LocusIdCompat getLocusId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocusIdCompat) ipChange.ipc$dispatch("400e2140", new Object[]{this}) : this.mLocusId;
    }

    public CharSequence getLongLabel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("46102ef1", new Object[]{this});
        }
        return this.mLongLabel;
    }

    public String getPackage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76da68e9", new Object[]{this});
        }
        return this.mPackageName;
    }

    public int getRank() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b0b181c", new Object[]{this})).intValue();
        }
        return this.mRank;
    }

    public CharSequence getShortLabel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("fbacdac5", new Object[]{this});
        }
        return this.mLabel;
    }

    public Bundle getTransientExtras() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("8cd601a2", new Object[]{this});
        }
        return this.mTransientExtras;
    }

    public UserHandle getUserHandle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserHandle) ipChange.ipc$dispatch("b5ee4de3", new Object[]{this});
        }
        return this.mUser;
    }

    public boolean hasKeyFieldsOnly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6db354d5", new Object[]{this})).booleanValue();
        }
        return this.mHasKeyFieldsOnly;
    }

    public boolean isCached() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("834c6177", new Object[]{this})).booleanValue();
        }
        return this.mIsCached;
    }

    public boolean isDeclaredInManifest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aff339a3", new Object[]{this})).booleanValue();
        }
        return this.mIsDeclaredInManifest;
    }

    public boolean isDynamic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c7749c0", new Object[]{this})).booleanValue();
        }
        return this.mIsDynamic;
    }

    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return this.mIsEnabled;
    }

    public boolean isImmutable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ff86403", new Object[]{this})).booleanValue();
        }
        return this.mIsImmutable;
    }

    public boolean isPinned() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("413ce92d", new Object[]{this})).booleanValue();
        }
        return this.mIsPinned;
    }

    public ShortcutInfo toShortcutInfo() {
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder intents;
        ShortcutInfo build;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return gsp.a(ipChange.ipc$dispatch("36b21397", new Object[]{this}));
        }
        qsp.a();
        shortLabel = psp.a(this.mContext, this.mId).setShortLabel(this.mLabel);
        intents = shortLabel.setIntents(this.mIntents);
        IconCompat iconCompat = this.mIcon;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.toIcon(this.mContext));
        }
        if (!TextUtils.isEmpty(this.mLongLabel)) {
            intents.setLongLabel(this.mLongLabel);
        }
        if (!TextUtils.isEmpty(this.mDisabledMessage)) {
            intents.setDisabledMessage(this.mDisabledMessage);
        }
        ComponentName componentName = this.mActivity;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.mCategories;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.mRank);
        PersistableBundle persistableBundle = this.mExtras;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Person[] personArr = this.mPersons;
            if (personArr != null && personArr.length > 0) {
                int length = personArr.length;
                android.app.Person[] personArr2 = new android.app.Person[length];
                for (int i = 0; i < length; i++) {
                    personArr2[i] = this.mPersons[i].toAndroidPerson();
                }
                intents.setPersons(personArr2);
            }
            LocusIdCompat locusIdCompat = this.mLocusId;
            if (locusIdCompat != null) {
                intents.setLocusId(locusIdCompat.toLocusId());
            }
            intents.setLongLived(this.mIsLongLived);
        } else {
            intents.setExtras(buildLegacyExtrasBundle());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.setExcludedFromSurfaces(intents, this.mExcludedSurfaces);
        }
        build = intents.build();
        return build;
    }

    public static LocusIdCompat getLocusId(ShortcutInfo shortcutInfo) {
        PersistableBundle extras;
        LocusId locusId;
        LocusId locusId2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocusIdCompat) ipChange.ipc$dispatch("46b99d1d", new Object[]{shortcutInfo});
        }
        if (Build.VERSION.SDK_INT >= 29) {
            locusId = shortcutInfo.getLocusId();
            if (locusId == null) {
                return null;
            }
            locusId2 = shortcutInfo.getLocusId();
            return LocusIdCompat.toLocusIdCompat(locusId2);
        }
        extras = shortcutInfo.getExtras();
        return getLocusIdFromExtra(extras);
    }

    public static boolean getLongLivedFromExtra(PersistableBundle persistableBundle) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30b60d35", new Object[]{persistableBundle})).booleanValue();
        }
        if (persistableBundle == null || !persistableBundle.containsKey(EXTRA_LONG_LIVED)) {
            return false;
        }
        z = persistableBundle.getBoolean(EXTRA_LONG_LIVED);
        return z;
    }

    public Intent getIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this});
        }
        Intent[] intentArr = this.mIntents;
        return intentArr[intentArr.length - 1];
    }

    private PersistableBundle buildLegacyExtrasBundle() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PersistableBundle) ipChange.ipc$dispatch("b644235d", new Object[]{this});
        }
        if (this.mExtras == null) {
            this.mExtras = new PersistableBundle();
        }
        Person[] personArr = this.mPersons;
        if (personArr != null && personArr.length > 0) {
            this.mExtras.putInt(EXTRA_PERSON_COUNT, personArr.length);
            while (i < this.mPersons.length) {
                PersistableBundle persistableBundle = this.mExtras;
                StringBuilder sb = new StringBuilder(EXTRA_PERSON_);
                int i2 = i + 1;
                sb.append(i2);
                persistableBundle.putPersistableBundle(sb.toString(), this.mPersons[i].toPersistableBundle());
                i = i2;
            }
        }
        LocusIdCompat locusIdCompat = this.mLocusId;
        if (locusIdCompat != null) {
            this.mExtras.putString(EXTRA_LOCUS_ID, locusIdCompat.getId());
        }
        this.mExtras.putBoolean(EXTRA_LONG_LIVED, this.mIsLongLived);
        return this.mExtras;
    }

    public static Person[] getPersonsFromExtra(PersistableBundle persistableBundle) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Person[]) ipChange.ipc$dispatch("22e86636", new Object[]{persistableBundle});
        }
        if (persistableBundle == null || !persistableBundle.containsKey(EXTRA_PERSON_COUNT)) {
            return null;
        }
        int i2 = persistableBundle.getInt(EXTRA_PERSON_COUNT);
        Person[] personArr = new Person[i2];
        while (i < i2) {
            StringBuilder sb = new StringBuilder(EXTRA_PERSON_);
            int i3 = i + 1;
            sb.append(i3);
            personArr[i] = Person.fromPersistableBundle(persistableBundle.getPersistableBundle(sb.toString()));
            i = i3;
        }
        return personArr;
    }

    public boolean isExcludedFromSurfaces(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2fe277c", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return (i & this.mExcludedSurfaces) != 0;
    }
}
