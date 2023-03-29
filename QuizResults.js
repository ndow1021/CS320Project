function addScript(url) {
    var script = document.createElement('script');
    script.type = 'application/javascript';
    script.src = url;
    document.head.appendChild(script);
}
addScript('https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.10.1/html2pdf.bundle.min.js');

var element = document.getElementById('element-to-print');
html2pdf(element);

// This will implicitly create the canvas and PDF objects before saving.
var worker = html2pdf().from(element).save();

var element = document.getElementById('element-to-print');
var opt = {
    margin:       1,
    filename:     'myfile.pdf',
    image:        { type: 'jpeg', quality: 0.98 },
    html2canvas:  { scale: 2 },
    jsPDF:        { unit: 'in', format: 'letter', orientation: 'portrait' }
};

// New Promise-based usage:
html2pdf().set(opt).from(element).save();

// Old monolithic-style usage:
html2pdf(element, opt);

// Avoid page-breaks on all elements, and add one before #page2el.
html2pdf().set({
    pagebreak: { mode: 'avoid-all', before: '#page2el' }
});

// Enable all 'modes', with no explicit elements.
html2pdf().set({
    pagebreak: { mode: ['avoid-all', 'css', 'legacy'] }
});

// No modes, only explicit elements.
html2pdf().set({
    pagebreak: { before: '.beforeClass', after: ['#after1', '#after2'], avoid: 'img' }
});