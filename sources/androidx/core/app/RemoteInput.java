package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class RemoteInput {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
    private static final String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
    public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    private static final String EXTRA_RESULTS_SOURCE = "android.remoteinput.resultsSource";
    public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    public static final int SOURCE_CHOICE = 1;
    public static final int SOURCE_FREE_FORM_INPUT = 0;
    private final boolean mAllowFreeFormTextInput;
    private final Set<String> mAllowedDataTypes;
    private final CharSequence[] mChoices;
    private final int mEditChoicesBeforeSending;
    private final Bundle mExtras;
    private final CharSequence mLabel;
    private final String mResultKey;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api20Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api20Impl() {
        }

        public static void addResultsToIntent(Object obj, Intent intent, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d9182c8", new Object[]{obj, intent, bundle});
            } else {
                android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[]) obj, intent, bundle);
            }
        }

        public static android.app.RemoteInput fromCompat(RemoteInput remoteInput) {
            Set<String> allowedDataTypes;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (android.app.RemoteInput) ipChange.ipc$dispatch("c683ac3d", new Object[]{remoteInput});
            }
            RemoteInput.Builder addExtras = new RemoteInput.Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (allowedDataTypes = remoteInput.getAllowedDataTypes()) != null) {
                for (String str : allowedDataTypes) {
                    Api26Impl.setAllowDataType(addExtras, str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.setEditChoicesBeforeSending(addExtras, remoteInput.getEditChoicesBeforeSending());
            }
            return addExtras.build();
        }

        public static Bundle getResultsFromIntent(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("a525474e", new Object[]{intent});
            }
            return android.app.RemoteInput.getResultsFromIntent(intent);
        }

        public static RemoteInput fromPlatform(Object obj) {
            Set<String> allowedDataTypes;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteInput) ipChange.ipc$dispatch("d1f41245", new Object[]{obj});
            }
            android.app.RemoteInput remoteInput = (android.app.RemoteInput) obj;
            Builder addExtras = new Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (allowedDataTypes = Api26Impl.getAllowedDataTypes(remoteInput)) != null) {
                for (String str : allowedDataTypes) {
                    addExtras.setAllowDataType(str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                addExtras.setEditChoicesBeforeSending(Api29Impl.getEditChoicesBeforeSending(remoteInput));
            }
            return addExtras.build();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static void addDataResultToIntent(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76724799", new Object[]{remoteInput, intent, map});
            } else {
                android.app.RemoteInput.addDataResultToIntent(RemoteInput.fromCompat(remoteInput), intent, map);
            }
        }

        public static Set<String> getAllowedDataTypes(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("62084e6f", new Object[]{obj});
            }
            return ((android.app.RemoteInput) obj).getAllowedDataTypes();
        }

        public static Map<String, Uri> getDataResultsFromIntent(Intent intent, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("67f8a2ff", new Object[]{intent, str});
            }
            return android.app.RemoteInput.getDataResultsFromIntent(intent, str);
        }

        public static RemoteInput.Builder setAllowDataType(RemoteInput.Builder builder, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteInput.Builder) ipChange.ipc$dispatch("1442542c", new Object[]{builder, str, new Boolean(z)});
            }
            return builder.setAllowDataType(str, z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api28Impl() {
        }

        public static int getResultsSource(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("44812cb2", new Object[]{intent})).intValue();
            }
            return android.app.RemoteInput.getResultsSource(intent);
        }

        public static void setResultsSource(Intent intent, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b2dfc30", new Object[]{intent, new Integer(i)});
            } else {
                android.app.RemoteInput.setResultsSource(intent, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api29Impl() {
        }

        public static int getEditChoicesBeforeSending(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bedf7f", new Object[]{obj})).intValue();
            }
            return ((android.app.RemoteInput) obj).getEditChoicesBeforeSending();
        }

        public static RemoteInput.Builder setEditChoicesBeforeSending(RemoteInput.Builder builder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteInput.Builder) ipChange.ipc$dispatch("d688da6f", new Object[]{builder, new Integer(i)});
            }
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private CharSequence[] mChoices;
        private CharSequence mLabel;
        private final String mResultKey;
        private final Set<String> mAllowedDataTypes = new HashSet();
        private final Bundle mExtras = new Bundle();
        private boolean mAllowFreeFormTextInput = true;
        private int mEditChoicesBeforeSending = 0;

        public Builder(String str) {
            if (str != null) {
                this.mResultKey = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        public Builder addExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("30d03c77", new Object[]{this, bundle});
            }
            if (bundle != null) {
                this.mExtras.putAll(bundle);
            }
            return this;
        }

        public RemoteInput build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteInput) ipChange.ipc$dispatch("8191745a", new Object[]{this});
            }
            return new RemoteInput(this.mResultKey, this.mLabel, this.mChoices, this.mAllowFreeFormTextInput, this.mEditChoicesBeforeSending, this.mExtras, this.mAllowedDataTypes);
        }

        public Bundle getExtras() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("66060624", new Object[]{this});
            }
            return this.mExtras;
        }

        public Builder setAllowDataType(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("cbd44e06", new Object[]{this, str, new Boolean(z)});
            }
            if (z) {
                this.mAllowedDataTypes.add(str);
            } else {
                this.mAllowedDataTypes.remove(str);
            }
            return this;
        }

        public Builder setAllowFreeFormInput(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("bed3528", new Object[]{this, new Boolean(z)});
            }
            this.mAllowFreeFormTextInput = z;
            return this;
        }

        public Builder setChoices(CharSequence[] charSequenceArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("66e71710", new Object[]{this, charSequenceArr});
            }
            this.mChoices = charSequenceArr;
            return this;
        }

        public Builder setEditChoicesBeforeSending(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f4ee83b5", new Object[]{this, new Integer(i)});
            }
            this.mEditChoicesBeforeSending = i;
            return this;
        }

        public Builder setLabel(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("60bc3c4b", new Object[]{this, charSequence});
            }
            this.mLabel = charSequence;
            return this;
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface EditChoicesBeforeSending {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface Source {
    }

    public RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.mResultKey = str;
        this.mLabel = charSequence;
        this.mChoices = charSequenceArr;
        this.mAllowFreeFormTextInput = z;
        this.mEditChoicesBeforeSending = i;
        this.mExtras = bundle;
        this.mAllowedDataTypes = set;
        if (getEditChoicesBeforeSending() == 2 && !getAllowFreeFormInput()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void addDataResultToIntent(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76724799", new Object[]{remoteInput, intent, map});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.addDataResultToIntent(remoteInput, intent, map);
        } else {
            Intent clipDataIntentFromIntent = getClipDataIntentFromIntent(intent);
            if (clipDataIntentFromIntent == null) {
                clipDataIntentFromIntent = new Intent();
            }
            for (Map.Entry<String, Uri> entry : map.entrySet()) {
                String key = entry.getKey();
                Uri value = entry.getValue();
                if (key != null) {
                    Bundle bundleExtra = clipDataIntentFromIntent.getBundleExtra(getExtraResultsKeyForData(key));
                    if (bundleExtra == null) {
                        bundleExtra = new Bundle();
                    }
                    bundleExtra.putString(remoteInput.getResultKey(), value.toString());
                    clipDataIntentFromIntent.putExtra(getExtraResultsKeyForData(key), bundleExtra);
                }
            }
            intent.setClipData(ClipData.newIntent(RESULTS_CLIP_LABEL, clipDataIntentFromIntent));
        }
    }

    public static void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56246024", new Object[]{remoteInputArr, intent, bundle});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api20Impl.addResultsToIntent(fromCompat(remoteInputArr), intent, bundle);
        } else {
            Bundle resultsFromIntent = getResultsFromIntent(intent);
            int resultsSource = getResultsSource(intent);
            if (resultsFromIntent != null) {
                resultsFromIntent.putAll(bundle);
                bundle = resultsFromIntent;
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                Map<String, Uri> dataResultsFromIntent = getDataResultsFromIntent(intent, remoteInput.getResultKey());
                Api20Impl.addResultsToIntent(fromCompat(new RemoteInput[]{remoteInput}), intent, bundle);
                if (dataResultsFromIntent != null) {
                    addDataResultToIntent(remoteInput, intent, dataResultsFromIntent);
                }
            }
            setResultsSource(intent, resultsSource);
        }
    }

    public static android.app.RemoteInput[] fromCompat(RemoteInput[] remoteInputArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (android.app.RemoteInput[]) ipChange.ipc$dispatch("d64d2639", new Object[]{remoteInputArr});
        }
        if (remoteInputArr == null) {
            return null;
        }
        android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            remoteInputArr2[i] = fromCompat(remoteInputArr[i]);
        }
        return remoteInputArr2;
    }

    public static RemoteInput fromPlatform(android.app.RemoteInput remoteInput) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteInput) ipChange.ipc$dispatch("1916e1ac", new Object[]{remoteInput});
        }
        return Api20Impl.fromPlatform(remoteInput);
    }

    public static Map<String, Uri> getDataResultsFromIntent(Intent intent, String str) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("67f8a2ff", new Object[]{intent, str});
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getDataResultsFromIntent(intent, str);
        }
        Intent clipDataIntentFromIntent = getClipDataIntentFromIntent(intent);
        if (clipDataIntentFromIntent == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : clipDataIntentFromIntent.getExtras().keySet()) {
            if (str2.startsWith(EXTRA_DATA_TYPE_RESULTS_DATA)) {
                String substring = str2.substring(39);
                if (!substring.isEmpty() && (string = clipDataIntentFromIntent.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    hashMap.put(substring, Uri.parse(string));
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    private static String getExtraResultsKeyForData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70df361f", new Object[]{str});
        }
        return EXTRA_DATA_TYPE_RESULTS_DATA + str;
    }

    public static Bundle getResultsFromIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("a525474e", new Object[]{intent});
        }
        return Api20Impl.getResultsFromIntent(intent);
    }

    public static int getResultsSource(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44812cb2", new Object[]{intent})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getResultsSource(intent);
        }
        Intent clipDataIntentFromIntent = getClipDataIntentFromIntent(intent);
        if (clipDataIntentFromIntent == null) {
            return 0;
        }
        return clipDataIntentFromIntent.getExtras().getInt(EXTRA_RESULTS_SOURCE, 0);
    }

    public static void setResultsSource(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2dfc30", new Object[]{intent, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.setResultsSource(intent, i);
        } else {
            Intent clipDataIntentFromIntent = getClipDataIntentFromIntent(intent);
            if (clipDataIntentFromIntent == null) {
                clipDataIntentFromIntent = new Intent();
            }
            clipDataIntentFromIntent.putExtra(EXTRA_RESULTS_SOURCE, i);
            intent.setClipData(ClipData.newIntent(RESULTS_CLIP_LABEL, clipDataIntentFromIntent));
        }
    }

    public boolean getAllowFreeFormInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c586ee92", new Object[]{this})).booleanValue();
        }
        return this.mAllowFreeFormTextInput;
    }

    public Set<String> getAllowedDataTypes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6829b093", new Object[]{this});
        }
        return this.mAllowedDataTypes;
    }

    public CharSequence[] getChoices() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence[]) ipChange.ipc$dispatch("38b27ec", new Object[]{this});
        }
        return this.mChoices;
    }

    public int getEditChoicesBeforeSending() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21607ba3", new Object[]{this})).intValue();
        }
        return this.mEditChoicesBeforeSending;
    }

    public Bundle getExtras() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("66060624", new Object[]{this});
        }
        return this.mExtras;
    }

    public CharSequence getLabel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("9d54ff55", new Object[]{this});
        }
        return this.mLabel;
    }

    public String getResultKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce30582d", new Object[]{this});
        }
        return this.mResultKey;
    }

    public boolean isDataOnly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a654ea4b", new Object[]{this})).booleanValue();
        }
        if (getAllowFreeFormInput()) {
            return false;
        }
        if ((getChoices() == null || getChoices().length == 0) && getAllowedDataTypes() != null && !getAllowedDataTypes().isEmpty()) {
            return true;
        }
        return false;
    }

    private static Intent getClipDataIntentFromIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("94c2a8bd", new Object[]{intent});
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(RESULTS_CLIP_LABEL)) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }

    public static android.app.RemoteInput fromCompat(RemoteInput remoteInput) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (android.app.RemoteInput) ipChange.ipc$dispatch("c683ac3d", new Object[]{remoteInput}) : Api20Impl.fromCompat(remoteInput);
    }
}
