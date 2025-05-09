package androidx.core.content;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.core.util.Predicate;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import tb.ref;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class IntentSanitizer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "IntentSanitizer";
    private boolean mAllowAnyComponent;
    private boolean mAllowClipDataText;
    private boolean mAllowIdentifier;
    private boolean mAllowSelector;
    private boolean mAllowSourceBounds;
    private Predicate<String> mAllowedActions;
    private Predicate<String> mAllowedCategories;
    private Predicate<ClipData> mAllowedClipData;
    private Predicate<Uri> mAllowedClipDataUri;
    private Predicate<ComponentName> mAllowedComponents;
    private Predicate<Uri> mAllowedData;
    private Map<String, Predicate<Object>> mAllowedExtras;
    private int mAllowedFlags;
    private Predicate<String> mAllowedPackages;
    private Predicate<String> mAllowedTypes;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api29Impl() {
        }

        public static String getIdentifier(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("14c94f9d", new Object[]{intent});
            }
            return intent.getIdentifier();
        }

        public static Intent setIdentifier(Intent intent, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("3a229d7a", new Object[]{intent, str});
            }
            return intent.setIdentifier(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api31Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api31Impl() {
        }

        public static void checkOtherMembers(int i, ClipData.Item item, Consumer<String> consumer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebd15c59", new Object[]{new Integer(i), item, consumer});
            } else if (item.getHtmlText() != null || item.getIntent() != null || item.getTextLinks() != null) {
                consumer.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int HISTORY_STACK_FLAGS = 2112614400;
        private static final int RECEIVER_FLAGS = 2015363072;
        private boolean mAllowAnyComponent;
        private boolean mAllowIdentifier;
        private boolean mAllowSelector;
        private boolean mAllowSomeComponents;
        private boolean mAllowSourceBounds;
        private int mAllowedFlags;
        private Predicate<String> mAllowedActions = new Predicate() { // from class: tb.aff
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return ppm.a(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return ppm.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate) {
                return ppm.c(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                boolean lambda$new$0;
                lambda$new$0 = IntentSanitizer.Builder.lambda$new$0((String) obj);
                return lambda$new$0;
            }
        };
        private Predicate<Uri> mAllowedData = new Predicate() { // from class: tb.bff
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return ppm.a(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return ppm.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate) {
                return ppm.c(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                boolean lambda$new$1;
                lambda$new$1 = IntentSanitizer.Builder.lambda$new$1((Uri) obj);
                return lambda$new$1;
            }
        };
        private Predicate<String> mAllowedTypes = new Predicate() { // from class: tb.cff
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return ppm.a(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return ppm.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate) {
                return ppm.c(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                boolean lambda$new$2;
                lambda$new$2 = IntentSanitizer.Builder.lambda$new$2((String) obj);
                return lambda$new$2;
            }
        };
        private Predicate<String> mAllowedCategories = new Predicate() { // from class: tb.dff
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return ppm.a(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return ppm.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate) {
                return ppm.c(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                boolean lambda$new$3;
                lambda$new$3 = IntentSanitizer.Builder.lambda$new$3((String) obj);
                return lambda$new$3;
            }
        };
        private Predicate<String> mAllowedPackages = new Predicate() { // from class: tb.eff
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return ppm.a(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return ppm.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate) {
                return ppm.c(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                boolean lambda$new$4;
                lambda$new$4 = IntentSanitizer.Builder.lambda$new$4((String) obj);
                return lambda$new$4;
            }
        };
        private Predicate<ComponentName> mAllowedComponents = new Predicate() { // from class: tb.fff
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return ppm.a(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return ppm.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate) {
                return ppm.c(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                boolean lambda$new$5;
                lambda$new$5 = IntentSanitizer.Builder.lambda$new$5((ComponentName) obj);
                return lambda$new$5;
            }
        };
        private Map<String, Predicate<Object>> mAllowedExtras = new HashMap();
        private boolean mAllowClipDataText = false;
        private Predicate<Uri> mAllowedClipDataUri = new Predicate() { // from class: tb.gff
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return ppm.a(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return ppm.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate) {
                return ppm.c(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                boolean lambda$new$6;
                lambda$new$6 = IntentSanitizer.Builder.lambda$new$6((Uri) obj);
                return lambda$new$6;
            }
        };
        private Predicate<ClipData> mAllowedClipData = new Predicate() { // from class: tb.hff
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return ppm.a(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return ppm.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate) {
                return ppm.c(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                boolean lambda$new$7;
                lambda$new$7 = IntentSanitizer.Builder.lambda$new$7((ClipData) obj);
                return lambda$new$7;
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowClipDataUriWithAuthority$11(String str, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("565c2aed", new Object[]{str, uri})).booleanValue();
            }
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowComponentWithPackage$9(String str, ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6049d1be", new Object[]{str, componentName})).booleanValue();
            }
            return str.equals(componentName.getPackageName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowDataWithAuthority$8(String str, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("29111cdf", new Object[]{str, uri})).booleanValue();
            }
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowExtra$12(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9d346d68", new Object[]{obj})).booleanValue();
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowExtra$14(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("31979fea", new Object[]{obj})).booleanValue();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowExtraOutput$16(String str, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("93294896", new Object[]{str, uri})).booleanValue();
            }
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowExtraStreamUriWithAuthority$15(String str, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dddafd67", new Object[]{str, uri})).booleanValue();
            }
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3c515464", new Object[]{str})).booleanValue();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$1(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4b047a94", new Object[]{uri})).booleanValue();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$3(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1ae62027", new Object[]{str})).booleanValue();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$4(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6517b968", new Object[]{str})).booleanValue();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$5(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("55582978", new Object[]{componentName})).booleanValue();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$7(ClipData clipData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("92c8d4a0", new Object[]{clipData})).booleanValue();
            }
            return false;
        }

        public Builder allowAction(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c6d7e5d", new Object[]{this, str});
            }
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            allowAction(new ref(str));
            return this;
        }

        public Builder allowCategory(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("23be72e5", new Object[]{this, str});
            }
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowCategory(new ref(str));
        }

        public Builder allowClipData(Predicate<ClipData> predicate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fad9af52", new Object[]{this, predicate});
            }
            Preconditions.checkNotNull(predicate);
            this.mAllowedClipData = this.mAllowedClipData.or(predicate);
            return this;
        }

        public Builder allowClipDataText() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b03befc4", new Object[]{this});
            }
            this.mAllowClipDataText = true;
            return this;
        }

        public Builder allowClipDataUri(Predicate<Uri> predicate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("bdce92b8", new Object[]{this, predicate});
            }
            Preconditions.checkNotNull(predicate);
            this.mAllowedClipDataUri = this.mAllowedClipDataUri.or(predicate);
            return this;
        }

        public Builder allowClipDataUriWithAuthority(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ec28abb2", new Object[]{this, str});
            }
            Preconditions.checkNotNull(str);
            return allowClipDataUri(new Predicate() { // from class: tb.xef
                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return ppm.a(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate negate() {
                    return ppm.b(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate or(Predicate predicate) {
                    return ppm.c(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    boolean lambda$allowClipDataUriWithAuthority$11;
                    lambda$allowClipDataUriWithAuthority$11 = IntentSanitizer.Builder.lambda$allowClipDataUriWithAuthority$11(str, (Uri) obj);
                    return lambda$allowClipDataUriWithAuthority$11;
                }
            });
        }

        public Builder allowComponent(final ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9aad1c01", new Object[]{this, componentName});
            }
            Preconditions.checkNotNull(componentName);
            Objects.requireNonNull(componentName);
            return allowComponent(new Predicate() { // from class: tb.vef
                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return ppm.a(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate negate() {
                    return ppm.b(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate or(Predicate predicate) {
                    return ppm.c(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return componentName.equals((ComponentName) obj);
                }
            });
        }

        public Builder allowComponentWithPackage(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("7068094a", new Object[]{this, str});
            }
            Preconditions.checkNotNull(str);
            return allowComponent(new Predicate() { // from class: tb.sef
                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return ppm.a(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate negate() {
                    return ppm.b(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate or(Predicate predicate) {
                    return ppm.c(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    boolean lambda$allowComponentWithPackage$9;
                    lambda$allowComponentWithPackage$9 = IntentSanitizer.Builder.lambda$allowComponentWithPackage$9(str, (ComponentName) obj);
                    return lambda$allowComponentWithPackage$9;
                }
            });
        }

        public Builder allowData(Predicate<Uri> predicate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d870bc62", new Object[]{this, predicate});
            }
            Preconditions.checkNotNull(predicate);
            this.mAllowedData = this.mAllowedData.or(predicate);
            return this;
        }

        public Builder allowDataWithAuthority(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("25cbb748", new Object[]{this, str});
            }
            Preconditions.checkNotNull(str);
            allowData(new Predicate() { // from class: tb.tef
                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return ppm.a(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate negate() {
                    return ppm.b(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate or(Predicate predicate) {
                    return ppm.c(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    boolean lambda$allowDataWithAuthority$8;
                    lambda$allowDataWithAuthority$8 = IntentSanitizer.Builder.lambda$allowDataWithAuthority$8(str, (Uri) obj);
                    return lambda$allowDataWithAuthority$8;
                }
            });
            return this;
        }

        public Builder allowExtra(String str, Class<?> cls) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("6529e612", new Object[]{this, str, cls}) : allowExtra(str, cls, new Predicate() { // from class: tb.iff
                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return ppm.a(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate negate() {
                    return ppm.b(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate or(Predicate predicate) {
                    return ppm.c(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    boolean lambda$allowExtra$12;
                    lambda$allowExtra$12 = IntentSanitizer.Builder.lambda$allowExtra$12(obj);
                    return lambda$allowExtra$12;
                }
            });
        }

        public Builder allowExtraOutput(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("93c3d126", new Object[]{this, str});
            }
            allowExtra("output", Uri.class, new Predicate() { // from class: tb.qef
                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return ppm.a(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate negate() {
                    return ppm.b(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate or(Predicate predicate) {
                    return ppm.c(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    boolean lambda$allowExtraOutput$16;
                    lambda$allowExtraOutput$16 = IntentSanitizer.Builder.lambda$allowExtraOutput$16(str, (Uri) obj);
                    return lambda$allowExtraOutput$16;
                }
            });
            return this;
        }

        public Builder allowExtraStream(Predicate<Uri> predicate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fc50a76", new Object[]{this, predicate});
            }
            allowExtra("android.intent.extra.STREAM", Uri.class, predicate);
            return this;
        }

        public Builder allowExtraStreamUriWithAuthority(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("97e9d4d6", new Object[]{this, str});
            }
            Preconditions.checkNotNull(str);
            allowExtra("android.intent.extra.STREAM", Uri.class, new Predicate() { // from class: tb.zef
                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return ppm.a(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate negate() {
                    return ppm.b(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate or(Predicate predicate) {
                    return ppm.c(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    boolean lambda$allowExtraStreamUriWithAuthority$15;
                    lambda$allowExtraStreamUriWithAuthority$15 = IntentSanitizer.Builder.lambda$allowExtraStreamUriWithAuthority$15(str, (Uri) obj);
                    return lambda$allowExtraStreamUriWithAuthority$15;
                }
            });
            return this;
        }

        public Builder allowFlags(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9be0f70b", new Object[]{this, new Integer(i)});
            }
            this.mAllowedFlags = i | this.mAllowedFlags;
            return this;
        }

        public Builder allowHistoryStackFlags() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("bc36d03e", new Object[]{this});
            }
            this.mAllowedFlags |= HISTORY_STACK_FLAGS;
            return this;
        }

        public Builder allowIdentifier() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c587e2c6", new Object[]{this});
            }
            this.mAllowIdentifier = true;
            return this;
        }

        public Builder allowPackage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("545513b", new Object[]{this, str});
            }
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowPackage(new ref(str));
        }

        public Builder allowReceiverFlags() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("51ea71c3", new Object[]{this});
            }
            this.mAllowedFlags |= RECEIVER_FLAGS;
            return this;
        }

        public Builder allowSelector() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8ded96bc", new Object[]{this});
            }
            this.mAllowSelector = true;
            return this;
        }

        public Builder allowSourceBounds() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b647bacd", new Object[]{this});
            }
            this.mAllowSourceBounds = true;
            return this;
        }

        public Builder allowType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b56243a1", new Object[]{this, str});
            }
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowType(new ref(str));
        }

        public IntentSanitizer build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IntentSanitizer) ipChange.ipc$dispatch("feda1f59", new Object[]{this});
            }
            boolean z = this.mAllowAnyComponent;
            if ((!z || !this.mAllowSomeComponents) && (z || this.mAllowSomeComponents)) {
                IntentSanitizer intentSanitizer = new IntentSanitizer();
                IntentSanitizer.access$102(intentSanitizer, this.mAllowedFlags);
                IntentSanitizer.access$202(intentSanitizer, this.mAllowedActions);
                IntentSanitizer.access$302(intentSanitizer, this.mAllowedData);
                IntentSanitizer.access$402(intentSanitizer, this.mAllowedTypes);
                IntentSanitizer.access$502(intentSanitizer, this.mAllowedCategories);
                IntentSanitizer.access$602(intentSanitizer, this.mAllowedPackages);
                IntentSanitizer.access$702(intentSanitizer, this.mAllowAnyComponent);
                IntentSanitizer.access$802(intentSanitizer, this.mAllowedComponents);
                IntentSanitizer.access$902(intentSanitizer, this.mAllowedExtras);
                IntentSanitizer.access$1002(intentSanitizer, this.mAllowClipDataText);
                IntentSanitizer.access$1102(intentSanitizer, this.mAllowedClipDataUri);
                IntentSanitizer.access$1202(intentSanitizer, this.mAllowedClipData);
                IntentSanitizer.access$1302(intentSanitizer, this.mAllowIdentifier);
                IntentSanitizer.access$1402(intentSanitizer, this.mAllowSelector);
                IntentSanitizer.access$1502(intentSanitizer, this.mAllowSourceBounds);
                return intentSanitizer;
            }
            throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowAnyComponent$10(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d1c479e6", new Object[]{componentName})).booleanValue();
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$2(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d0b486e6", new Object[]{str})).booleanValue();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$6(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("eba11faf", new Object[]{uri})).booleanValue();
            }
            return false;
        }

        public Builder allowAnyComponent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f5cd8a4e", new Object[]{this});
            }
            this.mAllowAnyComponent = true;
            this.mAllowedComponents = new Predicate() { // from class: tb.wef
                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return ppm.a(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate negate() {
                    return ppm.b(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate or(Predicate predicate) {
                    return ppm.c(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    boolean lambda$allowAnyComponent$10;
                    lambda$allowAnyComponent$10 = IntentSanitizer.Builder.lambda$allowAnyComponent$10((ComponentName) obj);
                    return lambda$allowAnyComponent$10;
                }
            };
            return this;
        }

        public <T> Builder allowExtra(String str, final Class<T> cls, final Predicate<T> predicate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8b8546ed", new Object[]{this, str, cls, predicate});
            }
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(predicate);
            return allowExtra(str, new Predicate() { // from class: tb.uef
                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate and(Predicate predicate2) {
                    return ppm.a(this, predicate2);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate negate() {
                    return ppm.b(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate or(Predicate predicate2) {
                    return ppm.c(this, predicate2);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    boolean lambda$allowExtra$13;
                    lambda$allowExtra$13 = IntentSanitizer.Builder.lambda$allowExtra$13(cls, predicate, obj);
                    return lambda$allowExtra$13;
                }
            });
        }

        public Builder allowExtraOutput(Predicate<Uri> predicate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3cab29f7", new Object[]{this, predicate});
            }
            allowExtra("output", Uri.class, predicate);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$allowExtra$13(Class cls, Predicate predicate, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d5d1a14f", new Object[]{cls, predicate, obj})).booleanValue();
            }
            return cls.isInstance(obj) && predicate.test(cls.cast(obj));
        }

        public Builder allowAction(Predicate<String> predicate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c95fbcae", new Object[]{this, predicate});
            }
            Preconditions.checkNotNull(predicate);
            this.mAllowedActions = this.mAllowedActions.or(predicate);
            return this;
        }

        public Builder allowCategory(Predicate<String> predicate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("7e2536", new Object[]{this, predicate});
            }
            Preconditions.checkNotNull(predicate);
            this.mAllowedCategories = this.mAllowedCategories.or(predicate);
            return this;
        }

        public Builder allowComponent(Predicate<ComponentName> predicate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d1d5d383", new Object[]{this, predicate});
            }
            Preconditions.checkNotNull(predicate);
            this.mAllowSomeComponents = true;
            this.mAllowedComponents = this.mAllowedComponents.or(predicate);
            return this;
        }

        public Builder allowPackage(Predicate<String> predicate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("88ac328c", new Object[]{this, predicate});
            }
            Preconditions.checkNotNull(predicate);
            this.mAllowedPackages = this.mAllowedPackages.or(predicate);
            return this;
        }

        public Builder allowType(Predicate<String> predicate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d322bbf2", new Object[]{this, predicate});
            }
            Preconditions.checkNotNull(predicate);
            this.mAllowedTypes = this.mAllowedTypes.or(predicate);
            return this;
        }

        public Builder allowExtra(String str, Predicate<Object> predicate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f44f6360", new Object[]{this, str, predicate});
            }
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(predicate);
            Predicate<Object> predicate2 = this.mAllowedExtras.get(str);
            if (predicate2 == null) {
                predicate2 = new Predicate() { // from class: tb.yef
                    @Override // androidx.core.util.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate3) {
                        return ppm.a(this, predicate3);
                    }

                    @Override // androidx.core.util.Predicate
                    public /* synthetic */ Predicate negate() {
                        return ppm.b(this);
                    }

                    @Override // androidx.core.util.Predicate
                    public /* synthetic */ Predicate or(Predicate predicate3) {
                        return ppm.c(this, predicate3);
                    }

                    @Override // androidx.core.util.Predicate
                    public final boolean test(Object obj) {
                        boolean lambda$allowExtra$14;
                        lambda$allowExtra$14 = IntentSanitizer.Builder.lambda$allowExtra$14(obj);
                        return lambda$allowExtra$14;
                    }
                };
            }
            this.mAllowedExtras.put(str, predicate2.or(predicate));
            return this;
        }
    }

    public static /* synthetic */ boolean access$1002(IntentSanitizer intentSanitizer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5acb94c", new Object[]{intentSanitizer, new Boolean(z)})).booleanValue();
        }
        intentSanitizer.mAllowClipDataText = z;
        return z;
    }

    public static /* synthetic */ int access$102(IntentSanitizer intentSanitizer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cdacd7c", new Object[]{intentSanitizer, new Integer(i)})).intValue();
        }
        intentSanitizer.mAllowedFlags = i;
        return i;
    }

    public static /* synthetic */ Predicate access$1102(IntentSanitizer intentSanitizer, Predicate predicate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Predicate) ipChange.ipc$dispatch("84a120eb", new Object[]{intentSanitizer, predicate});
        }
        intentSanitizer.mAllowedClipDataUri = predicate;
        return predicate;
    }

    public static /* synthetic */ Predicate access$1202(IntentSanitizer intentSanitizer, Predicate predicate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Predicate) ipChange.ipc$dispatch("8828c3ec", new Object[]{intentSanitizer, predicate});
        }
        intentSanitizer.mAllowedClipData = predicate;
        return predicate;
    }

    public static /* synthetic */ boolean access$1302(IntentSanitizer intentSanitizer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b2c0f", new Object[]{intentSanitizer, new Boolean(z)})).booleanValue();
        }
        intentSanitizer.mAllowIdentifier = z;
        return z;
    }

    public static /* synthetic */ boolean access$1402(IntentSanitizer intentSanitizer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b955250", new Object[]{intentSanitizer, new Boolean(z)})).booleanValue();
        }
        intentSanitizer.mAllowSelector = z;
        return z;
    }

    public static /* synthetic */ boolean access$1502(IntentSanitizer intentSanitizer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f10f7891", new Object[]{intentSanitizer, new Boolean(z)})).booleanValue();
        }
        intentSanitizer.mAllowSourceBounds = z;
        return z;
    }

    public static /* synthetic */ Predicate access$202(IntentSanitizer intentSanitizer, Predicate predicate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Predicate) ipChange.ipc$dispatch("da46da7d", new Object[]{intentSanitizer, predicate});
        }
        intentSanitizer.mAllowedActions = predicate;
        return predicate;
    }

    public static /* synthetic */ Predicate access$302(IntentSanitizer intentSanitizer, Predicate predicate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Predicate) ipChange.ipc$dispatch("ddce7d7e", new Object[]{intentSanitizer, predicate});
        }
        intentSanitizer.mAllowedData = predicate;
        return predicate;
    }

    public static /* synthetic */ Predicate access$402(IntentSanitizer intentSanitizer, Predicate predicate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Predicate) ipChange.ipc$dispatch("e156207f", new Object[]{intentSanitizer, predicate});
        }
        intentSanitizer.mAllowedTypes = predicate;
        return predicate;
    }

    public static /* synthetic */ Predicate access$502(IntentSanitizer intentSanitizer, Predicate predicate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Predicate) ipChange.ipc$dispatch("e4ddc380", new Object[]{intentSanitizer, predicate});
        }
        intentSanitizer.mAllowedCategories = predicate;
        return predicate;
    }

    public static /* synthetic */ Predicate access$602(IntentSanitizer intentSanitizer, Predicate predicate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Predicate) ipChange.ipc$dispatch("e8656681", new Object[]{intentSanitizer, predicate});
        }
        intentSanitizer.mAllowedPackages = predicate;
        return predicate;
    }

    public static /* synthetic */ boolean access$702(IntentSanitizer intentSanitizer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddb7f2e4", new Object[]{intentSanitizer, new Boolean(z)})).booleanValue();
        }
        intentSanitizer.mAllowAnyComponent = z;
        return z;
    }

    public static /* synthetic */ Predicate access$802(IntentSanitizer intentSanitizer, Predicate predicate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Predicate) ipChange.ipc$dispatch("ef74ac83", new Object[]{intentSanitizer, predicate});
        }
        intentSanitizer.mAllowedComponents = predicate;
        return predicate;
    }

    public static /* synthetic */ Map access$902(IntentSanitizer intentSanitizer, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b4992c88", new Object[]{intentSanitizer, map});
        }
        intentSanitizer.mAllowedExtras = map;
        return map;
    }

    private static void checkOtherMembers(int i, ClipData.Item item, Consumer<String> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd15c59", new Object[]{new Integer(i), item, consumer});
        } else if (item.getHtmlText() != null || item.getIntent() != null) {
            consumer.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sanitizeByFiltering$0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fddb596a", new Object[]{str});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sanitizeByThrowing$1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61657a57", new Object[]{str});
            return;
        }
        throw new SecurityException(str);
    }

    private void putExtra(Intent intent, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ed4aab", new Object[]{this, intent, str, obj});
        } else if (obj == null) {
            intent.getExtras().putString(str, null);
        } else if (obj instanceof Parcelable) {
            intent.putExtra(str, (Parcelable) obj);
        } else if (obj instanceof Parcelable[]) {
            intent.putExtra(str, (Parcelable[]) obj);
        } else if (obj instanceof Serializable) {
            intent.putExtra(str, (Serializable) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void sanitizeClipData(android.content.Intent r8, android.content.Intent r9, androidx.core.util.Predicate<android.content.ClipData> r10, boolean r11, androidx.core.util.Predicate<android.net.Uri> r12, androidx.core.util.Consumer<java.lang.String> r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.IntentSanitizer.sanitizeClipData(android.content.Intent, android.content.Intent, androidx.core.util.Predicate, boolean, androidx.core.util.Predicate, androidx.core.util.Consumer):void");
    }

    public Intent sanitizeByFiltering(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("49431a65", new Object[]{this, intent});
        }
        return sanitize(intent, new Consumer() { // from class: tb.pef
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                IntentSanitizer.lambda$sanitizeByFiltering$0((String) obj);
            }
        });
    }

    public Intent sanitizeByThrowing(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cfed41d3", new Object[]{this, intent});
        }
        return sanitize(intent, new Consumer() { // from class: tb.oef
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                IntentSanitizer.lambda$sanitizeByThrowing$1((String) obj);
            }
        });
    }

    private IntentSanitizer() {
    }

    public Intent sanitize(Intent intent, Consumer<String> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("a2ab3318", new Object[]{this, intent, consumer});
        }
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((!this.mAllowAnyComponent || component != null) && !this.mAllowedComponents.test(component)) {
            consumer.accept("Component is not allowed: " + component);
            intent2.setComponent(new ComponentName("android", "java.lang.Void"));
        } else {
            intent2.setComponent(component);
        }
        String str = intent.getPackage();
        if (str == null || this.mAllowedPackages.test(str)) {
            intent2.setPackage(str);
        } else {
            consumer.accept("Package is not allowed: ".concat(str));
        }
        int flags = this.mAllowedFlags | intent.getFlags();
        int i = this.mAllowedFlags;
        if (flags == i) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i);
            consumer.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.mAllowedFlags)));
        }
        String action = intent.getAction();
        if (action == null || this.mAllowedActions.test(action)) {
            intent2.setAction(action);
        } else {
            consumer.accept("Action is not allowed: ".concat(action));
        }
        Uri data = intent.getData();
        if (data == null || this.mAllowedData.test(data)) {
            intent2.setData(data);
        } else {
            consumer.accept("Data is not allowed: " + data);
        }
        String type = intent.getType();
        if (type == null || this.mAllowedTypes.test(type)) {
            intent2.setDataAndType(intent2.getData(), type);
        } else {
            consumer.accept("Type is not allowed: ".concat(type));
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String str2 : categories) {
                if (this.mAllowedCategories.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    consumer.accept("Category is not allowed: " + str2);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.mAllowedFlags & 1) == 0) {
                    consumer.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (!str3.equals("output") || ((~this.mAllowedFlags) & 3) == 0) {
                    Object obj = extras.get(str3);
                    Predicate<Object> predicate = this.mAllowedExtras.get(str3);
                    if (predicate == null || !predicate.test(obj)) {
                        consumer.accept("Extra is not allowed. Key: " + str3 + ". Value: " + obj);
                    } else {
                        putExtra(intent2, str3, obj);
                    }
                } else {
                    consumer.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                }
            }
        }
        sanitizeClipData(intent, intent2, this.mAllowedClipData, this.mAllowClipDataText, this.mAllowedClipDataUri, consumer);
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.mAllowIdentifier) {
                Api29Impl.setIdentifier(intent2, Api29Impl.getIdentifier(intent));
            } else if (Api29Impl.getIdentifier(intent) != null) {
                consumer.accept("Identifier is not allowed: " + Api29Impl.getIdentifier(intent));
            }
        }
        if (this.mAllowSelector) {
            intent2.setSelector(intent.getSelector());
        } else if (intent.getSelector() != null) {
            consumer.accept("Selector is not allowed: " + intent.getSelector());
        }
        if (this.mAllowSourceBounds) {
            intent2.setSourceBounds(intent.getSourceBounds());
        } else if (intent.getSourceBounds() != null) {
            consumer.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }
}
