/* Instructions: The goal of this exercise is to convert a string to a new string where each character in the
 * new string is "(" if that character appears only once in the original string, or ")" if that character
 * appears more than once in the original string. Ignore capitalization when determining if a character is a
 * duplicate. */

// my solution
function duplicateEncode(word) {
	word = word.toLowerCase();
	const wordMap = {};
	word
		.split('')
		.forEach((c) => (wordMap[c] = c in wordMap ? wordMap[c] + 1 : 1));
	return word
		.split('')
		.map((c) => (wordMap[c] > 1 ? ')' : '('))
		.join('');
}

// more clever solution from someone else
const duplicateEncode2 = (word) =>
	word
		.toLowerCase()
		.split('')
		.map((a, _, w) => (w.indexOf(a) == w.lastIndexOf(a) ? '(' : ')'))
		.join('');

console.log(duplicateEncode('every'));