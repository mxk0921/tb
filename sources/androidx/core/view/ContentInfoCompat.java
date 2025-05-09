package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import tb.f7l;
import tb.hp4;
import tb.ip4;
import tb.jp4;
import tb.zo4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ContentInfoCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_AUTOFILL = 4;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    public static final int SOURCE_PROCESS_TEXT = 5;
    private final Compat mCompat;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Api31Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api31Impl() {
        }

        public static Pair<ContentInfo, ContentInfo> partition(ContentInfo contentInfo, final Predicate<ClipData.Item> predicate) {
            ContentInfo contentInfo2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("cbbe76bc", new Object[]{contentInfo, predicate});
            }
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean test = predicate.test(clip.getItemAt(0));
                if (test) {
                    contentInfo2 = contentInfo;
                } else {
                    contentInfo2 = null;
                }
                if (test) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            Pair<ClipData, ClipData> partition = ContentInfoCompat.partition(clip, new androidx.core.util.Predicate() { // from class: tb.ap4
                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate and(androidx.core.util.Predicate predicate2) {
                    return ppm.a(this, predicate2);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate negate() {
                    return ppm.b(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate or(androidx.core.util.Predicate predicate2) {
                    return ppm.c(this, predicate2);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return predicate.test((ClipData.Item) obj);
                }
            });
            if (partition.first == null) {
                return Pair.create(null, contentInfo);
            }
            if (partition.second == null) {
                return Pair.create(contentInfo, null);
            }
            return Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) partition.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) partition.second).build());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface BuilderCompat {
        ContentInfoCompat build();

        void setClip(ClipData clipData);

        void setExtras(Bundle bundle);

        void setFlags(int i);

        void setLinkUri(Uri uri);

        void setSource(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface Compat {
        ClipData getClip();

        Bundle getExtras();

        int getFlags();

        Uri getLinkUri();

        int getSource();

        ContentInfo getWrapped();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Compat31Impl implements Compat {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final ContentInfo mWrapped;

        public Compat31Impl(ContentInfo contentInfo) {
            this.mWrapped = zo4.a(Preconditions.checkNotNull(contentInfo));
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ClipData getClip() {
            ClipData clip;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ClipData) ipChange.ipc$dispatch("de5aa8", new Object[]{this});
            }
            clip = this.mWrapped.getClip();
            return clip;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public Bundle getExtras() {
            Bundle extras;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("66060624", new Object[]{this});
            }
            extras = this.mWrapped.getExtras();
            return extras;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getFlags() {
            int flags;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a71a48cb", new Object[]{this})).intValue();
            }
            flags = this.mWrapped.getFlags();
            return flags;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public Uri getLinkUri() {
            Uri linkUri;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("5976789a", new Object[]{this});
            }
            linkUri = this.mWrapped.getLinkUri();
            return linkUri;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
            int source;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("abef1f0b", new Object[]{this})).intValue();
            }
            source = this.mWrapped.getSource();
            return source;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ContentInfo getWrapped() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return zo4.a(ipChange.ipc$dispatch("e24dd432", new Object[]{this}));
            }
            return this.mWrapped;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ContentInfoCompat{" + this.mWrapped + "}";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class CompatImpl implements Compat {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final ClipData mClip;
        private final Bundle mExtras;
        private final int mFlags;
        private final Uri mLinkUri;
        private final int mSource;

        public CompatImpl(BuilderCompatImpl builderCompatImpl) {
            this.mClip = (ClipData) Preconditions.checkNotNull(builderCompatImpl.mClip);
            this.mSource = Preconditions.checkArgumentInRange(builderCompatImpl.mSource, 0, 5, "source");
            this.mFlags = Preconditions.checkFlagsArgument(builderCompatImpl.mFlags, 1);
            this.mLinkUri = builderCompatImpl.mLinkUri;
            this.mExtras = builderCompatImpl.mExtras;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ClipData getClip() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ClipData) ipChange.ipc$dispatch("de5aa8", new Object[]{this});
            }
            return this.mClip;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public Bundle getExtras() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("66060624", new Object[]{this});
            }
            return this.mExtras;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getFlags() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a71a48cb", new Object[]{this})).intValue();
            }
            return this.mFlags;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public Uri getLinkUri() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("5976789a", new Object[]{this});
            }
            return this.mLinkUri;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("abef1f0b", new Object[]{this})).intValue();
            }
            return this.mSource;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ContentInfo getWrapped() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return zo4.a(ipChange.ipc$dispatch("e24dd432", new Object[]{this}));
            }
            return null;
        }

        public String toString() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.mClip.getDescription());
            sb.append(", source=");
            sb.append(ContentInfoCompat.sourceToString(this.mSource));
            sb.append(", flags=");
            sb.append(ContentInfoCompat.flagsToString(this.mFlags));
            String str2 = "";
            if (this.mLinkUri == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.mLinkUri.toString().length() + f7l.BRACKET_END_STR;
            }
            sb.append(str);
            if (this.mExtras != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface Flags {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface Source {
    }

    public ContentInfoCompat(Compat compat) {
        this.mCompat = compat;
    }

    public static ClipData buildClipData(ClipDescription clipDescription, List<ClipData.Item> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClipData) ipChange.ipc$dispatch("c2032e88", new Object[]{clipDescription, list});
        }
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem(list.get(i));
        }
        return clipData;
    }

    public static String flagsToString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("721aa697", new Object[]{new Integer(i)});
        }
        if ((1 & i) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i);
    }

    public static String sourceToString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8415252b", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return "SOURCE_APP";
        }
        if (i == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i == 4) {
            return "SOURCE_AUTOFILL";
        }
        if (i != 5) {
            return String.valueOf(i);
        }
        return "SOURCE_PROCESS_TEXT";
    }

    public static ContentInfoCompat toContentInfoCompat(ContentInfo contentInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentInfoCompat) ipChange.ipc$dispatch("f39efbf5", new Object[]{contentInfo});
        }
        return new ContentInfoCompat(new Compat31Impl(contentInfo));
    }

    public ClipData getClip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClipData) ipChange.ipc$dispatch("de5aa8", new Object[]{this});
        }
        return this.mCompat.getClip();
    }

    public Bundle getExtras() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("66060624", new Object[]{this});
        }
        return this.mCompat.getExtras();
    }

    public int getFlags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a71a48cb", new Object[]{this})).intValue();
        }
        return this.mCompat.getFlags();
    }

    public Uri getLinkUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("5976789a", new Object[]{this});
        }
        return this.mCompat.getLinkUri();
    }

    public int getSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abef1f0b", new Object[]{this})).intValue();
        }
        return this.mCompat.getSource();
    }

    public Pair<ContentInfoCompat, ContentInfoCompat> partition(androidx.core.util.Predicate<ClipData.Item> predicate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("b6664d6", new Object[]{this, predicate});
        }
        ClipData clip = this.mCompat.getClip();
        ContentInfoCompat contentInfoCompat = null;
        if (clip.getItemCount() == 1) {
            boolean test = predicate.test(clip.getItemAt(0));
            ContentInfoCompat contentInfoCompat2 = test ? this : null;
            if (!test) {
                contentInfoCompat = this;
            }
            return Pair.create(contentInfoCompat2, contentInfoCompat);
        }
        Pair<ClipData, ClipData> partition = partition(clip, predicate);
        if (partition.first == null) {
            return Pair.create(null, this);
        }
        if (partition.second == null) {
            return Pair.create(this, null);
        }
        return Pair.create(new Builder(this).setClip((ClipData) partition.first).build(), new Builder(this).setClip((ClipData) partition.second).build());
    }

    public ContentInfo toContentInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return zo4.a(ipChange.ipc$dispatch("dfe57a55", new Object[]{this}));
        }
        ContentInfo wrapped = this.mCompat.getWrapped();
        Objects.requireNonNull(wrapped);
        return zo4.a(wrapped);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.mCompat.toString();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class BuilderCompat31Impl implements BuilderCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final ContentInfo.Builder mPlatformBuilder;

        public BuilderCompat31Impl(ClipData clipData, int i) {
            this.mPlatformBuilder = hp4.a(clipData, i);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public ContentInfoCompat build() {
            ContentInfo build;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ContentInfoCompat) ipChange.ipc$dispatch("c45edee7", new Object[]{this});
            }
            build = this.mPlatformBuilder.build();
            return new ContentInfoCompat(new Compat31Impl(build));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setClip(ClipData clipData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("424a1758", new Object[]{this, clipData});
            } else {
                this.mPlatformBuilder.setClip(clipData);
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a597e5e8", new Object[]{this, bundle});
            } else {
                this.mPlatformBuilder.setExtras(bundle);
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setFlags(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a539337", new Object[]{this, new Integer(i)});
            } else {
                this.mPlatformBuilder.setFlags(i);
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setLinkUri(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9303550", new Object[]{this, uri});
            } else {
                this.mPlatformBuilder.setLinkUri(uri);
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setSource(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("685aaa5f", new Object[]{this, new Integer(i)});
            } else {
                this.mPlatformBuilder.setSource(i);
            }
        }

        public BuilderCompat31Impl(ContentInfoCompat contentInfoCompat) {
            jp4.a();
            this.mPlatformBuilder = ip4.a(contentInfoCompat.toContentInfo());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class BuilderCompatImpl implements BuilderCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ClipData mClip;
        public Bundle mExtras;
        public int mFlags;
        public Uri mLinkUri;
        public int mSource;

        public BuilderCompatImpl(ClipData clipData, int i) {
            this.mClip = clipData;
            this.mSource = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public ContentInfoCompat build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ContentInfoCompat) ipChange.ipc$dispatch("c45edee7", new Object[]{this});
            }
            return new ContentInfoCompat(new CompatImpl(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setClip(ClipData clipData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("424a1758", new Object[]{this, clipData});
            } else {
                this.mClip = clipData;
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a597e5e8", new Object[]{this, bundle});
            } else {
                this.mExtras = bundle;
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setFlags(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a539337", new Object[]{this, new Integer(i)});
            } else {
                this.mFlags = i;
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setLinkUri(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9303550", new Object[]{this, uri});
            } else {
                this.mLinkUri = uri;
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setSource(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("685aaa5f", new Object[]{this, new Integer(i)});
            } else {
                this.mSource = i;
            }
        }

        public BuilderCompatImpl(ContentInfoCompat contentInfoCompat) {
            this.mClip = contentInfoCompat.getClip();
            this.mSource = contentInfoCompat.getSource();
            this.mFlags = contentInfoCompat.getFlags();
            this.mLinkUri = contentInfoCompat.getLinkUri();
            this.mExtras = contentInfoCompat.getExtras();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final BuilderCompat mBuilderCompat;

        public Builder(ContentInfoCompat contentInfoCompat) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.mBuilderCompat = new BuilderCompat31Impl(contentInfoCompat);
            } else {
                this.mBuilderCompat = new BuilderCompatImpl(contentInfoCompat);
            }
        }

        public ContentInfoCompat build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ContentInfoCompat) ipChange.ipc$dispatch("c45edee7", new Object[]{this});
            }
            return this.mBuilderCompat.build();
        }

        public Builder setClip(ClipData clipData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2354686d", new Object[]{this, clipData});
            }
            this.mBuilderCompat.setClip(clipData);
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c05d03dd", new Object[]{this, bundle});
            }
            this.mBuilderCompat.setExtras(bundle);
            return this;
        }

        public Builder setFlags(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f61b2aee", new Object[]{this, new Integer(i)});
            }
            this.mBuilderCompat.setFlags(i);
            return this;
        }

        public Builder setLinkUri(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("910a9d75", new Object[]{this, uri});
            }
            this.mBuilderCompat.setLinkUri(uri);
            return this;
        }

        public Builder setSource(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("4fdb94c6", new Object[]{this, new Integer(i)});
            }
            this.mBuilderCompat.setSource(i);
            return this;
        }

        public Builder(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.mBuilderCompat = new BuilderCompat31Impl(clipData, i);
            } else {
                this.mBuilderCompat = new BuilderCompatImpl(clipData, i);
            }
        }
    }

    public static Pair<ClipData, ClipData> partition(ClipData clipData, androidx.core.util.Predicate<ClipData.Item> predicate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1b40d5d5", new Object[]{clipData, predicate});
        }
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < clipData.getItemCount(); i++) {
            ClipData.Item itemAt = clipData.getItemAt(i);
            if (predicate.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return Pair.create(null, clipData);
        }
        if (arrayList2 == null) {
            return Pair.create(clipData, null);
        }
        return Pair.create(buildClipData(clipData.getDescription(), arrayList), buildClipData(clipData.getDescription(), arrayList2));
    }

    public static Pair<ContentInfo, ContentInfo> partition(ContentInfo contentInfo, Predicate<ClipData.Item> predicate) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("cbbe76bc", new Object[]{contentInfo, predicate}) : Api31Impl.partition(contentInfo, predicate);
    }
}
