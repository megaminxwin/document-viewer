package org.ebookdroid.droids.mupdf.codec;

import org.ebookdroid.core.codec.CodecDocument;


public class CbzContext extends MuPdfContext {

    @Override
    public CodecDocument openDocument(final String fileName, final String password) {
        setExternalFonts();
        return new MuPdfDocument(this, MuPdfDocument.FORMAT_CBZ, fileName, password);
    }
}
