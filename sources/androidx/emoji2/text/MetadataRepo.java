package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MetadataRepo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_ROOT_SIZE = 1024;
    private static final String S_TRACE_CREATE_REPO = "EmojiCompat.MetadataRepo.create";
    private final char[] mEmojiCharArray;
    private final MetadataList mMetadataList;
    private final Node mRootNode = new Node(1024);
    private final Typeface mTypeface;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Node {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final SparseArray<Node> mChildren;
        private TypefaceEmojiRasterizer mData;

        private Node() {
            this(1);
        }

        public Node get(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Node) ipChange.ipc$dispatch("79294bf", new Object[]{this, new Integer(i)});
            }
            SparseArray<Node> sparseArray = this.mChildren;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        public final TypefaceEmojiRasterizer getData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TypefaceEmojiRasterizer) ipChange.ipc$dispatch("4f9a7f19", new Object[]{this});
            }
            return this.mData;
        }

        public void put(TypefaceEmojiRasterizer typefaceEmojiRasterizer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74984a00", new Object[]{this, typefaceEmojiRasterizer, new Integer(i), new Integer(i2)});
                return;
            }
            Node node = get(typefaceEmojiRasterizer.getCodepointAt(i));
            if (node == null) {
                node = new Node();
                this.mChildren.put(typefaceEmojiRasterizer.getCodepointAt(i), node);
            }
            if (i2 > i) {
                node.put(typefaceEmojiRasterizer, i + 1, i2);
            } else {
                node.mData = typefaceEmojiRasterizer;
            }
        }

        public Node(int i) {
            this.mChildren = new SparseArray<>(i);
        }
    }

    private MetadataRepo(Typeface typeface, MetadataList metadataList) {
        this.mTypeface = typeface;
        this.mMetadataList = metadataList;
        this.mEmojiCharArray = new char[metadataList.listLength() * 2];
        constructIndex(metadataList);
    }

    private void constructIndex(MetadataList metadataList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82662213", new Object[]{this, metadataList});
            return;
        }
        int listLength = metadataList.listLength();
        for (int i = 0; i < listLength; i++) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer = new TypefaceEmojiRasterizer(this, i);
            Character.toChars(typefaceEmojiRasterizer.getId(), this.mEmojiCharArray, i * 2);
            put(typefaceEmojiRasterizer);
        }
    }

    public static MetadataRepo create(Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetadataRepo) ipChange.ipc$dispatch("7ff9680e", new Object[]{typeface});
        }
        try {
            TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            return new MetadataRepo(typeface, new MetadataList());
        } finally {
            TraceCompat.endSection();
        }
    }

    public char[] getEmojiCharArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("cfb61d24", new Object[]{this});
        }
        return this.mEmojiCharArray;
    }

    public MetadataList getMetadataList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetadataList) ipChange.ipc$dispatch("149407bd", new Object[]{this});
        }
        return this.mMetadataList;
    }

    public int getMetadataVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b55efb6d", new Object[]{this})).intValue();
        }
        return this.mMetadataList.version();
    }

    public Node getRootNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Node) ipChange.ipc$dispatch("d6833724", new Object[]{this});
        }
        return this.mRootNode;
    }

    public Typeface getTypeface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("3161bb0a", new Object[]{this});
        }
        return this.mTypeface;
    }

    public void put(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6337d1a0", new Object[]{this, typefaceEmojiRasterizer});
            return;
        }
        Preconditions.checkNotNull(typefaceEmojiRasterizer, "emoji metadata cannot be null");
        Preconditions.checkArgument(typefaceEmojiRasterizer.getCodepointsLength() > 0, "invalid metadata codepoint length");
        this.mRootNode.put(typefaceEmojiRasterizer, 0, typefaceEmojiRasterizer.getCodepointsLength() - 1);
    }

    public static MetadataRepo create(Typeface typeface, InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetadataRepo) ipChange.ipc$dispatch("9464ecfb", new Object[]{typeface, inputStream});
        }
        try {
            TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            return new MetadataRepo(typeface, MetadataListReader.read(inputStream));
        } finally {
            TraceCompat.endSection();
        }
    }

    public static MetadataRepo create(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetadataRepo) ipChange.ipc$dispatch("25f8d839", new Object[]{typeface, byteBuffer});
        }
        try {
            TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            return new MetadataRepo(typeface, MetadataListReader.read(byteBuffer));
        } finally {
            TraceCompat.endSection();
        }
    }

    public static MetadataRepo create(AssetManager assetManager, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetadataRepo) ipChange.ipc$dispatch("52c08f25", new Object[]{assetManager, str});
        }
        try {
            TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            return new MetadataRepo(Typeface.createFromAsset(assetManager, str), MetadataListReader.read(assetManager, str));
        } finally {
            TraceCompat.endSection();
        }
    }
}
